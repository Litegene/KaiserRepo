package com.example.springKaiser.controller;

import com.example.springKaiser.business.channel.ChannelService;
import com.example.springKaiser.entities.Channel;
import com.example.springKaiser.repositories.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChannelController {
    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private ChannelService channelService;

    @GetMapping("/channelList")
    public List<Channel> listChannel() {
        return channelService.listChannel();
    }

    @GetMapping("/listByChannel/{channelName}")
    public List<Channel> listChannel(@PathVariable String channelName){
        return channelService.listByChannel(channelName);
    }

    @GetMapping("/listAbout/{channelName}")
    public String listChannelAbout(@PathVariable String channelName){
        return channelService.about(channelName);
    }

    @PostMapping("/saveChannel")
    public String saveChannel(@RequestBody Channel channel){
        try{
            channelService.saveChannel(channel);
        } catch (Exception e){
            return "Failure " + e.getMessage();
        }
        return "Added succesfully";
    }
}
