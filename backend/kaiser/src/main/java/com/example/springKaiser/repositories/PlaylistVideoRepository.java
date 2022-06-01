package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.PlaylistVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PlaylistVideoRepository extends JpaRepository<PlaylistVideo, Integer>{
    @Query(value = "Select * from videotable JOIN playlistvideotable on videoid = videotable.id JOIN playlistnametable on playlistnameid = playlistnametable.id where playlistname = :playlistname", nativeQuery = true)
    List<PlaylistVideo> findByPlaylistName(String playlistname);
}
