package com.example.springKaiser.controller;

import com.example.springKaiser.business.joinvideoandtag.JoinVideoAndTagService;
import com.example.springKaiser.business.joinvideoandtag.ListVideoAndTagDto;
import com.example.springKaiser.business.playlist.ListPlaylistByChannelDto;
import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.repositories.JoinVideoAndTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoinVideoAndTagController {
    @Autowired
    JoinVideoAndTagRepository joinVideoAndTagRepository;

    @Autowired
    JoinVideoAndTagService joinVideoAndTagService;

    @GetMapping("/listVideoAndTag")
    public List<JoinVideoAndTag> listJoinVideoAndTag(){
        return joinVideoAndTagService.listVideoAndTag();
    }

    @GetMapping("/listVideoAndTagDto/{videoName}")
    public List<ListVideoAndTagDto> listByVideoName(@PathVariable String videoName){
        return joinVideoAndTagService.listTagsByVideoName(videoName);
    }
}
