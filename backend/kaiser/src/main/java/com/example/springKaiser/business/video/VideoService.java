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

    @Autowired VideoMapper videoMapper;

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

//    Homework
    public List<VideoDto> listVideoDto() {
//        List<VideoDto> videoDtoList = videoRepository.findAll().stream().map(this::convertDto).collect(Collectors.toList());
//        return  videoDtoList;

//        Lambda example
//        videoRepository.findAll().stream().map(videoEntry->{
//            videoEntry.setLikes(9);
//            return convertDto(videoEntry);
//        }).collect(Collectors.toList());
        return ((List<Video>) videoRepository.findAll()).stream().map(this::convertDto).collect(Collectors.toList());
    }

//Homework
    private VideoDto convertDto(Video video){
        VideoDto dto = new VideoDto();
        dto.setName(video.getName());
        dto.setComments(video.getComments());
        dto.setLikes(video.getLikes());
        dto.setViews(video.getViews());
        Channel channel = channelRepository.findById(video.getChannel().getId()).get();
        dto.setChannelId(video.getChannel().getId());
        return dto;
    }

//    no longer working as channel name (string) has been replaced with a channel object

//    public List<Video> listByChannel(String channelName){
//        List<Video> listByChannelName = new ArrayList<>();
//        for (Video video : listVideo()){
//            if (video.getChannel().equals(channelName)){
//                listByChannelName.add(video);
//            }
//        }
//        return listByChannelName;
//    }
//Homework
    public List<VideoDto> listByChannelDto(int channelId){
//        List<VideoDto> videoDtos = videoMapper.findByChannelId(channelId, listVideoDto();
//        return videoDtos;
        //above code does the same as below
        return videoMapper.findByChannelId(channelId, listVideoDto());
    }

    public String saveVideos(VideoDto videoDto){
        Video video = videoMapper.videoDtoToVideoEntity(videoDto);
        videoRepository.save(video);
        return "Success " + video.getName();
    }
}