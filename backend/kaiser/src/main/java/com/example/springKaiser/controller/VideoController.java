package com.example.springKaiser.controller;

import com.example.springKaiser.business.video.VideoDto;
import com.example.springKaiser.business.video.VideoLikeDto;
import com.example.springKaiser.business.video.VideoService;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoController {
    @Autowired
    private VideoRepository videoRepo;

    @Autowired
    private VideoService videoService;


    //Get, Update, Post and Put
        //Get is a retrieval
        //Post is like a save, but more data involved
        //Put is an update I think? google it bro

        @GetMapping("/videoList")
        public List<Video> listVideo() {
            return videoService.listVideo();
        }

        @GetMapping("/videoListDto")
        public List<VideoDto> listVideoDto() {
            return videoService.listVideoDto();
        }

        @GetMapping("/videoLikeListDto")
        public List<VideoLikeDto> listVideoLikeDto() {
            return videoService.listVideoLikesDto();
        }

//        @GetMapping("/listVideoByChannel/{channelName}")
//        public List<Video> listByChannel(@PathVariable String channelName){
//            return videoService.listByChannel(channelName);
//        }

        @GetMapping("/listVideoByChannelDto/{channelId}")
        public List<VideoDto> listByChannelDto(@PathVariable int channelId){
            return videoService.listByChannelDto(channelId);
        }

        @PostMapping("/saveVideo")
        public void saveVideo(@RequestBody Video video){

            videoService.saveVideo(video);
        }

        @PostMapping("/saveVideoDto")
        public String saveVideoDto(@RequestBody VideoDto videoDto){

            return videoService.saveVideos(videoDto);
        }
}
