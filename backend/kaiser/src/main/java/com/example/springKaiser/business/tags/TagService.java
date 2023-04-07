package com.example.springKaiser.business.tags;

import com.example.springKaiser.business.playlist.ListPlaylistByChannelDto;
import com.example.springKaiser.business.video.VideoDto;
import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.JoinVideoAndTagRepository;
import com.example.springKaiser.repositories.TagRepository;
import com.example.springKaiser.entities.Tags;
import com.example.springKaiser.repositories.VideoRepository;
import org.hibernate.mapping.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    @Autowired
    JoinVideoAndTagRepository joinVideoAndTagRepository;

    @Autowired
    VideoRepository videoRepository;

//    search videoName, if exists, load tagDetails, convert tagDetails to string object, add extra tag to string object, save back into object and database
//    public String addTagToVideo(String tagName, String videoName){
//        Video video = videoRepository.findOneByName(videoName);
//
//        return "Success";
//    }

    public List<Tags> listTags() {
        List<Tags> listTags = tagRepository.findAll();
        return listTags;
    }

    public List<JoinVideoAndTag> listVideoAndTags(){
        List<JoinVideoAndTag> joinVideoAndTagList = joinVideoAndTagRepository.findAll();
        return joinVideoAndTagList;
    }

}
