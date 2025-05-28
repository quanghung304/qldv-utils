package com.agribank.qldvutils.response.report26;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report26DtoResponse {
    String fullName;
    String staffCode;
    Integer type;
    String decisionNumber;
    Date decisionDate;
}
