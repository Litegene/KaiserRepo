package com.example.springKaiser.business.joinvideoandtag;

public class JoinVideoAndTagDto {
    private int tagId;
    private int videoId;

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}
