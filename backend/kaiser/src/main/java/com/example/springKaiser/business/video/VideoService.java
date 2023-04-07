package com.example.springKaiser.business.video;

import com.example.springKaiser.entities.*;
import com.example.springKaiser.repositories.ChannelRepository;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    ChannelRepository channelRepository;

//    public String saveAVideo(Video video){
//        return video.getName();
//    }

    public String saveAVideo(Video video){
        if(video.getChannel() != null){
            saveVideo(video);
        }
        return "Success" + video.getName() + " is saved";
    }

    public void saveVideo(Video video){
        videoRepository.save(video);
    }

    public List<Video> listVideo() {
        List<Video> listVideo = videoRepository.findAll();
        return listVideo;
    }

//        Homework
    public List<VideoDto> listVideoDto() {
        List<VideoDto> videoDtoList = new ArrayList<>();
        List<Video> videoListFromRepository = videoRepository.findAll();
        for (Video videoList : videoListFromRepository) {
            videoDtoList.add(this.convertDto(videoList));
        }
        return videoDtoList;

    }

    public List<VideoLikeDto> listVideoLikesDto() {
        List<VideoLikeDto> videoLikeDtoList = new ArrayList<>();
        List<Video> videoListFromRepository = videoRepository.findAll();
        for (Video videoList : videoListFromRepository) {
            videoLikeDtoList.add(this.convertLikeDto(videoList));
        }
        return videoLikeDtoList;
    }
    private VideoLikeDto convertLikeDto(Video video){
        VideoLikeDto dto = new VideoLikeDto();
        dto.setName(video.getName());
        dto.setLikes(video.getLikes());
//        Channel channel = channelRepository.findById(video.getChannel().getId()).get();
        return dto;
    }
//Homework
    private VideoDto convertDto(Video video){
        VideoDto dto = new VideoDto();
        dto.setName(video.getName());
        dto.setComments(video.getComments());
        dto.setLikes(video.getLikes());
        dto.setViews(video.getViews());
//        Channel channel = channelRepository.findById(video.getChannel().getId()).get();
        dto.setChannelId(video.getChannel().getId());
        return dto;
    }
//Homework
    public List<VideoDto> listByChannelDto(int channelId){
        List<VideoDto> listByChannelNameDto = new ArrayList<>();
        for (VideoDto videoDto : listVideoDto()){
            if (videoDto.getChannelId() == channelId){
                listByChannelNameDto.add(videoDto);
            }
        }
        return listByChannelNameDto;
    }

    public String saveVideos(VideoDto videoDto){
        Video video = new Video();
        video.setName(videoDto.getName());

        video.setComments(videoDto.getComments());
        video.setLikes(videoDto.getLikes());
        video.setViews(videoDto.getViews());
        Channel channel = channelRepository.findById(videoDto.getChannelId()).get();
        video.setChannel(channel);
        videoRepository.save(video);
        return "Success " + video.getName();
    }
}