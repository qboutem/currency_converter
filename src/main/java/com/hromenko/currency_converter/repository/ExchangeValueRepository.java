package com.hromenko.currency_converter.repository;

import com.hromenko.currency_converter.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
