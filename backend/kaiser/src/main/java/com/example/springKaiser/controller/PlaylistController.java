package com.example.springKaiser.controller;

import com.example.springKaiser.business.playlist.AddVideoToPlayListRequestDto;
import com.example.springKaiser.business.playlist.ListPlaylistByChannelDto;
import com.example.springKaiser.business.playlist.ListPlaylistByVideoNameAndChannelNameDto;
import com.example.springKaiser.business.playlist.PlaylistService;
import com.example.springKaiser.entities.PlaylistName;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.repositories.PlaylistNameRepository;
import com.example.springKaiser.repositories.PlaylistVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaylistController {

    @Autowired
    PlaylistNameRepository playlistNameRepository;

    @Autowired
    PlaylistVideoRepository playlistVideoRepository;

    @Autowired
    PlaylistService playlistService;


    @PostMapping("/createPlaylist")
    public void createPlaylist(@RequestBody PlaylistName playlistName){
        playlistService.addPlaylist(playlistName);
    }

    @PostMapping("/addVideo")
    public void addvideo(@RequestBody PlaylistVideo playlistVideo){
        playlistService.addVideo(playlistVideo);
    }

    @GetMapping("/sortPlaylist")
    public List<PlaylistName> sortPlaylist(){
        return playlistService.sortPlaylist();
    }

    @GetMapping("/listPlaylist")
    public List<PlaylistName> listPlaylist(){
        return playlistService.listPlaylist();
    }

    @GetMapping("/listPlaylistVideo")
    public List<PlaylistVideo> listPlaylistVideo(){
        return playlistService.listPlaylistVideo();
    }

    @GetMapping("/findPlaylist/{playlistName}")
    public String playlistNames(@PathVariable String playlistName){
        return playlistService.countPlaylist(playlistName);
    }

    @PostMapping("/addVideoToPlaylist")
    public void addVideoToPlaylist(@RequestBody AddVideoToPlayListRequestDto addVideoToPlayListRequestDto){
        playlistService.addVideoToPlaylist(addVideoToPlayListRequestDto.getPlaylistName(), addVideoToPlayListRequestDto.getVideoName());
    }

    @GetMapping("/listByVideoNameAndChannelName")
    public ListPlaylistByVideoNameAndChannelNameDto listPlaylistByVideoNameAndChannelName(@RequestBody ListPlaylistByVideoNameAndChannelNameDto listPlaylistByVideoNameAndChannelNameDto){
        return playlistService.listByVideoNameAndChannelName(listPlaylistByVideoNameAndChannelNameDto.getVideoName(), listPlaylistByVideoNameAndChannelNameDto.getChannelName());
    }

    @GetMapping("/findPlaylistByChannelName/{channelName}")
    public List<ListPlaylistByChannelDto> playlistNameByChannelName(@PathVariable String channelName){
        return playlistService.listPlaylistNameByChannelName(channelName);
    }
}
