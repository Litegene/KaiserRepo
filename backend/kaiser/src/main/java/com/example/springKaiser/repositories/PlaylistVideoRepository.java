package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.PlaylistVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PlaylistVideoRepository extends JpaRepository<PlaylistVideo, Integer>{
    @Query(value = "Select * from videotable JOIN playlistvideotable on videoid = videotable.id JOIN playlistnametable on playlistnameid = playlistnametable.id where playlistname = :playlistname", nativeQuery = true)
    List<PlaylistVideo> findByPlaylistName(String playlistname);

    //annotated query @Query
    @Query(value = "Select * from playlistvideotable JOIN videotable on videoid = videotable.id JOIN channeltable on channelid = channeltable.id JOIN playlistnametable on playlistnameid =playlistnametable.id where name = :videoname and channelname = :channelname", nativeQuery = true)
    List<PlaylistVideo> findByVideoNameAndChannelName(String videoname, String channelname);

    @Query(value = "Select * from playlistvideotable JOIN videotable on videoid = videotable.id JOIN channeltable on channelid = channeltable.id JOIN playlistnametable on playlistnameid =playlistnametable.id where channelname = :channelname", nativeQuery = true)
    List<PlaylistVideo> findPlaylistNameByChannelName(String channelname);
}
