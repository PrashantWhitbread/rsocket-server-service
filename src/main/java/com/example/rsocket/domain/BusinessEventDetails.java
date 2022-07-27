package com.example.rsocket.domain;

import java.util.Set;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEventDetails {

  private Set<BusinessEventDataElement> businessEventDetails;

}
