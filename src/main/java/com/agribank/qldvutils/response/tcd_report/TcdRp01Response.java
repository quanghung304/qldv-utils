package com.agribank.qldvutils.response.tcd_report;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdRp01Response {
    String code;
    String name;
    String form;
    Integer b1;
    Integer b2;
    Integer b3;
    Integer c1;
    Integer c2;
    Integer d;
}
