package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.PlaylistName;
import com.example.springKaiser.entities.PlaylistVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PlaylistNameRepository extends JpaRepository<PlaylistName, Integer>{
    @Query(value = "Select * from playlistnametable where playlistname = :playlistname", nativeQuery = true)
    PlaylistName findOneByName(String playlistname);
}
