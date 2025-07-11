package com.agribank.qldvutils.response.dv_report;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvRp22Response {
    String organizationCode;
    String organizationGroupBName;
    String organizationGroupCName;
    String staffCode;
    String fullName;
    Date birthDay;
    String mainJob;
    String recruitBrcd;
    Date admissionDate;
    String suggested;
    String resolutionNumber;
    Date resolutionDate;
    String decisionNumber;
    Date decisionDate;
    //cán bộ thực hiện
    String implementationStaff;
    //kiểm soát viên
    String controller;
    //Lãnh đạo ban
    String boardLeader;
}
