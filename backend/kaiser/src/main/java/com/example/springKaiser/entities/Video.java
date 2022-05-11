package com.example.springKaiser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "videotable", schema = "public")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer comments;
    private Integer likes;
    private Integer views;
    @ManyToOne
    @JoinColumn(name = "channelID")
    private Channel channel;

    public Video() {
    }

    public Video(Integer id, String name, Integer comments, Integer likes, Channel channel, Integer views) {
        this.id = id;
        this.name = name;
        this.comments = comments;
        this.likes = likes;
        this.channel = channel;
        this.views = views;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
}