package com.agribank.qldvutils.response.bcsl_report.tcd;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BcslTcdRp02Response {
    String code;
    String name;
    String form;
    Integer establish;
    Integer upgrade;
    Integer downgrade;
    Integer dissolve;
    Integer disband;
}
