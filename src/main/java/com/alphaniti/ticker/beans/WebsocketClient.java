package com.alphaniti.ticker.beans;

import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
public class WebsocketClient {

    private static final String URL = "wss://localhost:3000";

    @PostConstruct
    public void init() {
        WebSocketStompClient stompClient = new WebSocketStompClient(new StandardWebSocketClient());
        stompClient.setMessageConverter(new MappingJackson2MessageConverter());

        StompSessionHandler sessionHandler = new MyStompSessionHandler();
        stompClient.connect(URL, sessionHandler);

        // Use a separate thread to keep the application running
        new Thread(() -> {
            new Scanner(System.in).nextLine(); // Don't close immediately.
        }).start();
    }
}
