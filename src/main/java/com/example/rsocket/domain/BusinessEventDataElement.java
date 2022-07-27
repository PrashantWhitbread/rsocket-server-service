package com.example.rsocket.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEventDataElement {

  private String dataElement;

  private String newValue;

  private String oldValue;

  private String scopeFrom;

  private String scopeTo;

}
