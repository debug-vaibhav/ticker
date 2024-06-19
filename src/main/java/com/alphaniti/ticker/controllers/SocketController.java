package com.alphaniti.ticker.controllers;

import com.alphaniti.ticker.models.Ticker;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Ticker greeting(Ticker ticker) {
        return ticker;
    }
}
