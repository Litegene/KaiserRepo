package com.example.springKaiser.controller;

import com.example.springKaiser.entities.Subscriber;
import com.example.springKaiser.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriberController {
    @Autowired
    private SubscriberRepository subscriberRepo;

    @GetMapping("/subscribers")
    public String listAll(Model model) {
        List<Subscriber> listSubscriber = subscriberRepo.findAll();
        //model.addAttribute("listSubscribers", listSubscriber);
        String totalStrings = "";
        for (Subscriber sub : listSubscriber) {
            totalStrings += "Subscriber ID:" + sub.getSubscriber_id() + "Subscriber Name: " + sub.getSubscriber_name() + " ------> ";
        }

        return totalStrings;
    }
}