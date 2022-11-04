package com.example.springKaiser.business.playlist;

import com.example.springKaiser.entities.PlaylistName;
import com.example.springKaiser.repositories.PlaylistNameRepository;
import com.example.springKaiser.repositories.PlaylistVideoRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springKaiser.entities.PlaylistVideo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class PlaylistServiceTest {

    @Autowired
    PlaylistService playlistService;

    @MockBean
    PlaylistVideoRepository playlistVideoRepository;

    @MockBean
    PlaylistNameRepository playlistNameRepository;

    @Test
    void listPlaylist() {
        List<PlaylistName> playlistNameExample = new ArrayList<>();
        PlaylistName playlistName = new PlaylistName();
        playlistName.setPlaylistname("playlisttest1");
        playlistNameExample.add(playlistName);
        Mockito.when(playlistNameRepository.findAll()).thenReturn(playlistNameExample);

//        playlistService.listPlaylist();
        List<PlaylistName> testResult = playlistService.listPlaylist();

        Assert.assertEquals("playlisttest1", testResult.get(0).getPlaylistname());
    }

    @Test
    void listPlaylistVideo() {
        List<PlaylistVideo> playlistVideoExample = new ArrayList<>();
        PlaylistVideo playlistVideo = new PlaylistVideo();
        PlaylistName playlistName = new PlaylistName();
        playlistName.setPlaylistname("testplaylist");
        playlistVideo.setPlaylistName(playlistName);
        playlistVideoExample.add(playlistVideo);
        Mockito.when(playlistVideoRepository.findAll()).thenReturn(playlistVideoExample);

        List<PlaylistVideo> testResult = playlistService.listPlaylistVideo();

        Assert.assertEquals("testplaylist", testResult.get(0).getPlaylistName().getPlaylistname());
//        2 more asserts:
//          array length of test result greater than 0
        Assert.assertNotEquals(testResult.size(), 0);
//        preferable to the above assert
//        Assert.assertEquals(testResult.size(), testResult.size()>0);
//          getplaylistname does not equal null
        Assert.assertNotNull(testResult);
    }

    @Test
    void countPlaylist() {
        List<PlaylistVideo> playlistVideoTest = new ArrayList<>();
        PlaylistVideo playlistVideo = new PlaylistVideo();
        PlaylistName playlistName = new PlaylistName();
        playlistName.setPlaylistname("test");
        playlistVideo.setPlaylistName(playlistName);
        playlistVideoTest.add(0, playlistVideo);
        Mockito.when(playlistVideoRepository.findByPlaylistName("")).thenReturn(playlistVideoTest);

        String testResult = playlistService.countPlaylist("");

        Assert.assertEquals("Number of videos inside playlist: " + 1,testResult);
    }
//    https://blog.knoldus.com/unit-testing-void-methods-with-mockito-and-junit/
//    https://www.baeldung.com/mockito-void-methods

//    @Test
//    void addPlaylist() {
//        PlaylistService playlistService1 = Mockito.mock(PlaylistService.class);
//        PlaylistName playlistName = new PlaylistName();
//        playlistName.setPlaylistname("test");
//        playlistName.setId(1);
//        Mockito.doNothing().when(playlistService1).addPlaylist(playlistName);
//    }

//    @Test
//    void addVideo() {
//    }
//
//    @Test
//    void testListPlaylist() {
//    }
//
//    @Test
//    void sortPlaylist() {
//    }
//
//    @Test
//    void testListPlaylistVideo() {
//    }
//
//    @Test
//    void testCountPlaylist() {
//    }
//
//    @Test
//    void addVideoToPlaylist() {
//    }
//
//    @Test
//    void listByVideoNameAndChannelName() {
//    }
//
//    @Test
//    void listPlaylistNameByChannelName() {
//    }
}