package com.alphaniti.ticker.jpa;

import com.alphaniti.ticker.models.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerRepository extends JpaRepository<Ticker, Integer> {
}
