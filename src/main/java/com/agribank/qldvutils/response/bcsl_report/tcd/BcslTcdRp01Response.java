package com.agribank.qldvutils.response.bcsl_report.tcd;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BcslTcdRp01Response {
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
