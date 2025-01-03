package com.agribank.qldvutils.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tcd01CheckDto {
    String maSo;
    String capTren;
}
