package com.example.rsocket.domain;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.Value;

@Builder
@Value
@RequiredArgsConstructor
@ToString
public class Greeting {
  private String greeting;
}
