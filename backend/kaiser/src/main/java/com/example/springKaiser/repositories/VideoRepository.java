package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}