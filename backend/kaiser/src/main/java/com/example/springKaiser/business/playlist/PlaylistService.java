package com.example.springKaiser.business.playlist;

import com.example.springKaiser.repositories.*;
import com.example.springKaiser.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlaylistService {
    @Autowired
    PlaylistNameRepository playlistNameRepository;

    @Autowired
    PlaylistVideoRepository playlistVideoRepository;

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    VideoRepository videoRepository;


    public void addPlaylist(PlaylistName playlistName){

        playlistNameRepository.save(playlistName);
    }

    public void addVideo(PlaylistVideo playlistVideo){

        playlistVideoRepository.save(playlistVideo);
    }

    public List<PlaylistName> listPlaylist(){
        List<PlaylistName> listPlaylistName = playlistNameRepository.findAll();
        return listPlaylistName;
    }

    public List<PlaylistName> sortPlaylist(){
        List<PlaylistName> listByPlaylistName = playlistNameRepository.findAll();
        List<PlaylistName> sortList = listByPlaylistName.stream().sorted(Comparator.comparing(PlaylistName::getPlaylistname)).collect(Collectors.toList());
        return sortList;
    }

    public List<PlaylistVideo> listPlaylistVideo(){
        List<PlaylistVideo> listPlaylistVideo = playlistVideoRepository.findAll();
        return listPlaylistVideo;
    }

        public String countPlaylist(String playlistName){
        List<PlaylistVideo> listByPlaylistVideo =playlistVideoRepository.findByPlaylistName(playlistName);

        return "Number of videos inside playlist: " + listByPlaylistVideo.size();
    }

    public String addVideoToPlaylist(String playlist, String videoName){

        PlaylistName playlistName = playlistNameRepository.findOneByName(playlist);
        Video video = videoRepository.findOneByName(videoName);
        PlaylistVideo playlistVideo = new PlaylistVideo();
        playlistVideo.setPlaylistName(playlistName);
        playlistVideo.setVideo(video);
        playlistVideoRepository.save(playlistVideo);

        return "Success";
    }
}
