package com.alphaniti.ticker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebSocketMessageBroker
public class TickerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TickerApplication.class, args);
	}

}
