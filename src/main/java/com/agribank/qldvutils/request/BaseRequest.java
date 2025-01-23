package com.agribank.qldvutils.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseRequest {
    String action;
    Integer page = 0;
    String token;
}
