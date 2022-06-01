package com.example.springKaiser.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "playlistvideotable", schema = "public")
public class PlaylistVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "playlistnameid")
    private PlaylistName playlistName;

    @ManyToOne
    @JoinColumn(name = "videoid")
    private Video video;

    public PlaylistVideo(){}

    public PlaylistVideo(Integer id, PlaylistName playlistName, Video video) {
        this.id = id;
        this.playlistName = playlistName;
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlaylistName getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(PlaylistName playlistName) {
        this.playlistName = playlistName;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
