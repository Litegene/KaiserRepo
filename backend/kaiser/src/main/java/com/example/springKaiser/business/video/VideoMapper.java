package com.example.springKaiser.business.video;

import com.example.springKaiser.business.student.StudentDto;
import com.example.springKaiser.entities.Channel;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.ChannelRepository;
import com.example.springKaiser.repositories.PlaylistVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoMapper {

    @Autowired ChannelRepository channelRepository;
//  method can be called toEntity()
    //saving video
    Video videoDtoToVideoEntity(VideoDto videoDto){
        Video video = new Video();
        video.setName(videoDto.getName());
        video.setComments(videoDto.getComments());
        video.setLikes(videoDto.getLikes());
        video.setViews(videoDto.getViews());
        Channel channel = channelRepository.findById(videoDto.getChannelId()).get();
        video.setChannel(channel);
        return video;
    }

    List<VideoDto> findByChannelId(int channelId, List<VideoDto> listVideoDto ){
        List<VideoDto> listByChannelNameDto = new ArrayList<>();
        for (VideoDto videoDto : listVideoDto){
            if (videoDto.getChannelId() == channelId){
                listByChannelNameDto.add(videoDto);
            }
        }
        return listByChannelNameDto;
    }
//    List<Video> toList(List<VideoDto> videoDtoList){
//        List<Video> listByChannelNameDto = new ArrayList<>();
//
//        for (int i = 0; i < videoDtoList.size(); i++) {
//            Video video = videoDtoToVideoEntity(videoDtoList.get(i));
//            listByChannelNameDto.add(video);
//        }
//        return listByChannelNameDto;
//    }

}
