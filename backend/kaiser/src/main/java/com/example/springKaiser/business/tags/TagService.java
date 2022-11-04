package com.example.springKaiser.business.tags;

import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.TagRepository;
import com.example.springKaiser.entities.Tags;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class TagService {
    @Autowired
    TagRepository tagRepository;

    @Autowired
    VideoRepository videoRepository;

//    search videoName, if exists, load tagDetails, convert tagDetails to string object, add extra tag to string object, save back into object and database
//    public String addTagToVideo(String tagName, String videoName){
//        Video video = videoRepository.findOneByName(videoName);
//
//        return "Success";
//    }
}
