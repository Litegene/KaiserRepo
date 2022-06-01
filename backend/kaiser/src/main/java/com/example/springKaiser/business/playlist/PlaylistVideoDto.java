package com.example.springKaiser.business.playlist;

import com.example.springKaiser.business.video.VideoDto;
import com.example.springKaiser.entities.Channel;
import com.example.springKaiser.entities.PlaylistName;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Video;

public class PlaylistVideoDto {

    private String playlistNameId;
    private VideoDto videoDto;

    public String getPlaylistNameId() {
        return playlistNameId;
    }

    public void setPlaylistNameId(String playlistNameId) {
        this.playlistNameId = playlistNameId;
    }

    public VideoDto getVideoDto() {
        return videoDto;
    }

    public void setVideoDto(VideoDto videoDto) {
        this.videoDto = videoDto;
    }
}
