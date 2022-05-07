package com.example.springKaiser.business.channel;

import com.example.springKaiser.entities.Channel;
import com.example.springKaiser.repositories.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelService {

    @Autowired
    ChannelRepository channelRepository;

    public void saveChannel(Channel channel){

        channelRepository.save(channel);
    }

    public List<Channel> listChannel() {
        List<Channel> listChannel = channelRepository.findAll();
        return listChannel;
    }

    public List<Channel> listByChannel(String channelName){
        List<Channel> listByChannelName = new ArrayList<>();
        for (Channel channel : listChannel()){
            if (channel.getChannelName().equals(channelName)){
                listByChannelName.add(channel);
            }
        }
        return listByChannelName;
    }

    public String about(String channelName){
        String aboutDetails = "";
        for(Channel channel : listChannel()){
            if (channel.getChannelName().equals(channelName)){
                aboutDetails = channel.getAbout();
            }
        }
        return aboutDetails;
    }
}