package com.alphaniti.ticker.controllers;

import com.alphaniti.ticker.jpa.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alphaniti.ticker.models.Ticker;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private TickerRepository tickerRepository;

    @GetMapping("")
    public Ticker index(){
        return tickerRepository.save(new Ticker("NIFTY"));
    }
}
