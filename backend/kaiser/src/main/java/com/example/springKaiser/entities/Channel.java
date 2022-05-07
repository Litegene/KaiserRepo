package com.example.springKaiser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "channeltable",schema="public")
public class Channel {
    @Id
    private Integer id;
    private String channelname;
    private String playlist;
    private String about;

    public Channel(){}

    public Channel(Integer id, String channelName, String playList, String about) {
        this.id = id;
        this.channelname = channelName;
        this.playlist = playList;
        this.about = about;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelname;
    }

    public void setChannelName(String channelName) {
        this.channelname = channelName;
    }

    public String getPlayList() {
        return playlist;
    }

    public void setPlayList(String playList) {
        this.playlist = playList;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
