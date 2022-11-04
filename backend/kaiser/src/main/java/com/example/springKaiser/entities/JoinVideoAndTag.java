package com.example.springKaiser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "joinvideoandtagtable", schema = "public")

public class JoinVideoAndTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tags tag;

    @ManyToOne
    @JoinColumn(name = "videoid")
    private Video video;

    public JoinVideoAndTag(){}

    public JoinVideoAndTag(Integer id, Tags tag, Video video) {
        this.id = id;
        this.tag = tag;
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tags getTag() {
        return tag;
    }

    public void setTag(Tags tag) {
        this.tag = tag;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
