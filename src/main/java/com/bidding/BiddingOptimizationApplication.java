package com.bidding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BiddingOptimizationApplication {

  public static void main(String[] args) {
    SpringApplication.run(BiddingOptimizationApplication.class, args);
  }
}
