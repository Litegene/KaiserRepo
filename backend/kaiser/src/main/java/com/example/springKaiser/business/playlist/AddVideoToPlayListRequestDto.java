package com.example.springKaiser.business.playlist;

public class AddVideoToPlayListRequestDto {
    private String playlistName;
    private String videoName;

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
