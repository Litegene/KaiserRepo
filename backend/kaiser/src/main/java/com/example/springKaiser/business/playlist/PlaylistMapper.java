package com.example.springKaiser.business.playlist;

import com.example.springKaiser.entities.PlaylistName;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.PlaylistVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaylistMapper {

//    @Autowired
//    PlaylistVideoRepository playlistVideoRepository;

    ListPlaylistByVideoNameAndChannelNameDto playlistEntityToPlaylistDto(List<PlaylistVideo> playlistVideos){
        ListPlaylistByVideoNameAndChannelNameDto listPlaylistByVideoNameAndChannelNameDtos = new ListPlaylistByVideoNameAndChannelNameDto();
        listPlaylistByVideoNameAndChannelNameDtos.setPlaylistName(playlistVideos.get(0).getPlaylistName().getPlaylistname());
        listPlaylistByVideoNameAndChannelNameDtos.setVideoName(playlistVideos.get(0).getVideo().getName());
        listPlaylistByVideoNameAndChannelNameDtos.setChannelName(playlistVideos.get(0).getVideo().getChannel().getChannelName());
        return listPlaylistByVideoNameAndChannelNameDtos;
    }

    List<ListPlaylistByChannelDto> playlistEntityToPlaylistChannelDto(List<PlaylistVideo> playlistVideos){
        List<ListPlaylistByChannelDto> listPlaylistByChannelDtos = new ArrayList<>();
        for (int i = 0; i < playlistVideos.size(); i++) {
            ListPlaylistByChannelDto listPlaylistByChannelDto = new ListPlaylistByChannelDto();
            listPlaylistByChannelDto.setPlaylistName(playlistVideos.get(i).getPlaylistName().getPlaylistname());
            listPlaylistByChannelDto.setChannelName(playlistVideos.get(i).getVideo().getChannel().getChannelName());
            listPlaylistByChannelDtos.add(listPlaylistByChannelDto);
        }
        return listPlaylistByChannelDtos;
    }

    PlaylistVideo addPlaylistAndVideo(PlaylistName playlistName, Video video){
        PlaylistVideo playlistVideo = new PlaylistVideo();
        playlistVideo.setPlaylistName(playlistName);
        playlistVideo.setVideo(video);
        return playlistVideo;
    }
}

