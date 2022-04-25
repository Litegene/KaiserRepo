package com.example.springKaiser.controller;

import com.example.springKaiser.entities.Subscriber;
import com.example.springKaiser.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SubscriberController {
    @Autowired
    private SubscriberRepository subscriberRepo;

    @GetMapping("/subscribers")
    public String listAll(Model model) {
        List<Subscriber> listSubscriber = subscriberRepo.findAll();
        model.addAttribute("listSubscribers", listSubscriber);

        return "subscribers";
    }

}