package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.PlaylistVideo;
import com.example.springKaiser.entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//public interface TagRepository {
//
//}
public interface TagRepository extends JpaRepository<Tags, Integer> {

}