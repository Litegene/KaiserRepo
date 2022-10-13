package com.example.springKaiser.business.video;

import com.example.springKaiser.entities.Video;
import com.example.springKaiser.repositories.VideoRepository;
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
}