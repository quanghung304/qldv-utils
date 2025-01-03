package com.agribank.qldvutils.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tcd01CheckResponse {
    String maSo;
    String capTren;
}
