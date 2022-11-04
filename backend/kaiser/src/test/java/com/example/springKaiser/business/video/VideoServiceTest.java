package com.example.springKaiser.business.video;

import com.example.springKaiser.business.channel.ChannelService;
import com.example.springKaiser.entities.Channel;
import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.ChannelRepository;
import com.example.springKaiser.repositories.VideoRepository;
import liquibase.pro.packaged.V;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class VideoServiceTest {

    @Autowired
    VideoService videoService;

    //Mock data (in this case VideoRepository), so we can call it when we call the service.
    @MockBean
    VideoRepository videoRepository;

    @MockBean
    ChannelRepository channelRepository;

    @Test
    void listVideoTest() {
        //Unit test layout: When, Call Service, Assert/Test

        //When
        List<Video> videoListExample = new ArrayList<>();
        Video video = new Video();
        video.setName("Test1");
        videoListExample.add(video);
        Mockito.when(videoRepository.findAll()).thenReturn(videoListExample);

        //Call Service
        List<Video> testResult = videoService.listVideo();

        //Assert/Test
        //Expected Result, then Value we're receiving
        //"Test1" .equals testResult.get(0).getName()

        //Below are a couple ways to use asserts:
        //This way checks if a condition is true
        Assert.assertTrue(("Test1").equals(testResult.get(0).getName()));
        //This way compares to strings/objects
        Assert.assertEquals("Test1",testResult.get(0).getName());
    }


    @Test
    void listByChannelDto() {
        //When
//        List<VideoDto> videoDtoListExample = new ArrayList<>();
//        VideoDto videoDto = new VideoDto();
//        VideoService videoService = new VideoService();
//        videoDto.setName("DTOTest1");
//        videoDto.setChannelId(1);
//        videoDtoListExample.add(videoDto);
//        Mockito.when(videoRepository.findAll()).thenReturn();


        //Call Service need to convert DTO in to Video object
//        List<Video> testResult2 = videoService.listByChannelDto();

        //Assert
//        Assert.assertTrue(("DTOTest1").equals(testResult2.get(0).getName()));

        Channel channel = new Channel();
        channel.setId(2);
        List<Video> videos = new ArrayList<>();
        Video video = new Video();
        video.setLikes(4);
        video.setComments(5);
        video.setViews(10);
        video.setName("Test Data");
        video.setId(5);
        video.setChannel(channel);
        videos.add(video);
        Mockito.when(videoRepository.findAll()).thenReturn(videos);

        List<VideoDto> videoDtoList = videoService.listByChannelDto(2);

//        System.out.println("test");
//        Assert.assertTrue(("Test Data1").equals(videoDtoList.get(0).getName()));
        Assert.assertEquals("Test Data",videoDtoList.get(0).getName());
        Assert.assertEquals(videoDtoList.size(),1);
    }


    @Test
    void saveVideosExample() {
//        Channel channel = channelRepository.findById(videoDto.getChannelId()).get()
        int channelID = 1;
        Channel channel = new Channel();
//        channel.setChannelName("testname");
        Mockito.when(channelRepository.findById(channelID)).thenReturn(java.util.Optional.of(channel));
        VideoDto videoDto = new VideoDto();
        videoDto.setChannelId(1);
        videoDto.setName("testname");
//        can add more hard coded data

//        videoService.saveVideos(videoDto);
        String testResult = videoService.saveVideos(videoDto);

        Assert.assertEquals("Success testname", testResult);
    }
}