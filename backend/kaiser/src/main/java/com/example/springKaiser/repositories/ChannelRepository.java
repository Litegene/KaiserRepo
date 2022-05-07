package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Integer> {

}