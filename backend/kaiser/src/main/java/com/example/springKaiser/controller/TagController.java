package com.example.springKaiser.controller;

import com.example.springKaiser.business.tags.TagDto;
import com.example.springKaiser.business.tags.TagService;
import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Tags;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.JoinVideoAndTagRepository;
import com.example.springKaiser.repositories.TagRepository;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    TagRepository tagRepository;

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    JoinVideoAndTagRepository joinVideoAndTagRepository;

    @Autowired
    TagService tagService;

    @GetMapping("/listTags")
    public List<Tags> listTags(){
        return tagService.listTags();
    }

    @GetMapping("/listVideoAndTags")
    public List<JoinVideoAndTag> joinVideoAndTags(){
        return tagService.listVideoAndTags();
    }

//    @GetMapping("/getVideoTagInfo/(videoName")
//    public List<TagDto> listByVideoName(@PathVariable String videoName){
//        return tagService
//    }
}
