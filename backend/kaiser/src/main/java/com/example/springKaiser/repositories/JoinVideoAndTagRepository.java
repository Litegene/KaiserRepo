package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.JoinVideoAndTag;
import com.example.springKaiser.entities.PlaylistVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//public interface JoinVideoAndTagRepository{
//
//}
public interface JoinVideoAndTagRepository extends JpaRepository<JoinVideoAndTag, Integer>{
    @Query(value = "Select * from videotable JOIN joinvideoandtagtable on videoid = videotable.id JOIN tagtable on tagid = tagtable.id where name ILIKE '%' || :name || '%'", nativeQuery = true)
    List<JoinVideoAndTag> findByVideoName(String name);
}
