package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideoRepository extends JpaRepository<Video, Integer> {
    @Query(value = "Select * from videotable where name = :videoName", nativeQuery = true)
    Video findOneByName(String videoName);
}