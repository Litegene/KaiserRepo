package com.example.springKaiser.business.joinvideoandtag;

import com.example.springKaiser.business.playlist.ListPlaylistByVideoNameAndChannelNameDto;
import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.repositories.JoinVideoAndTagRepository;
import com.example.springKaiser.repositories.TagRepository;
import com.example.springKaiser.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<ListVideoAndTagDto> listTagsByVideoName(String videoName) {
        List<JoinVideoAndTag> joinVideoAndTagList = joinVideoAndTagRepository.findByVideoName(videoName);
        List<ListVideoAndTagDto> listVideoAndTagDtos = new ArrayList<>();
        for (int i = 0; i < joinVideoAndTagList.size(); i++) {
            ListVideoAndTagDto listVideoAndTagDto = new ListVideoAndTagDto();
            listVideoAndTagDto.setTagName(joinVideoAndTagList.get(i).getTag().getTagName());
            listVideoAndTagDto.setVideoName(joinVideoAndTagList.get(i).getVideo().getName());
            listVideoAndTagDtos.add(listVideoAndTagDto);
        }

        return listVideoAndTagDtos;
    }
}
