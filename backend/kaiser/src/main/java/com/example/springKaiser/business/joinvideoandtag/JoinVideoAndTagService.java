package com.example.springKaiser.business.joinvideoandtag;

import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.repositories.JoinVideoAndTagRepository;
import com.example.springKaiser.repositories.TagRepository;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinVideoAndTagService {
    @Autowired
    TagRepository tagRepository;

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    JoinVideoAndTagRepository joinVideoAndTagRepository;

    public List<JoinVideoAndTag> listVideoAndTag(){
        List<JoinVideoAndTag> listVideoAndTag = joinVideoAndTagRepository.findAll();
        return listVideoAndTag;
    }
}
