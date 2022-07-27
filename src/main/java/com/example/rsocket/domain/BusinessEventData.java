package com.example.rsocket.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEventData {

    private BusinessEvent businessEvent;

    private BusinessEventId businessEventId;

}
