package com.agribank.qldvutils.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report32Response {
    String organizationCode;
    String name;
    String staffCode;
    String fullName;
    Date birthDay;
    String mainJob;
    String recruitBrcd;
    String partyCommitteeJob;
    String decisionNumber;
    String reason;
    Date transferDate;
    Date expectedExpiryDate;
    Integer transferType;
}
