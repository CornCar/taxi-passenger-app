package com.EONET.eonet.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class TaxiPostDto {
    private Long id;
    private Long writerId;
    private String departure;
    private String destination;
    private LocalDateTime departureTime;
    private Integer expectedFare;
    private String expectedTime;
    private Integer maxPeople;
    private String status;

    // getters and setters
    // ...
}