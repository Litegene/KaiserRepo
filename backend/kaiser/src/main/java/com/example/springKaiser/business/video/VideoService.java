package com.example.springKaiser.business.video;

import com.example.springKaiser.entities.Students;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

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

    public List<Video> listByChannel(String channelName){
        List<Video> listByChannelName = new ArrayList<>();
        for (Video video : listVideo()){
            if (video.getChannel().equals(channelName)){
                listByChannelName.add(video);
            }
        }
        return listByChannelName;
    }
}