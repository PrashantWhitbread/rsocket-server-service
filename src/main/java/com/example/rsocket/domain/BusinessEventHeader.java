package com.example.rsocket.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BusinessEventHeader {

  private String moduleName;

  private String actionType;

  private Long actionId;

  private String primaryKey;

  private Long publisherId;

  private LocalDateTime createdDateTime;

  private String hotelId;

}
