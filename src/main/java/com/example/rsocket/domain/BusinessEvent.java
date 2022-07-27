package com.example.rsocket.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEvent {

  private BusinessEventHeader header;

  private BusinessEventDetails details;

}
