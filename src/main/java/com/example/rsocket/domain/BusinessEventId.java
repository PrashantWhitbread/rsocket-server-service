package com.example.rsocket.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEventId {

  private String id;

}
