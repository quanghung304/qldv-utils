package com.agribank.qldvutils.response.dv_report;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvRp28Response {
    String staffCode;
    String fullName;
    String organizationCode;
    String organizationName;
    Date birthDay;
    String mainJob;
    String recruitBrcd;
    //Chức danh cấp ủy
    String partyCommitteeJob;
    //Chức danh đoàn thể
    String organizationalJob;
    String transferringPartyName;
    Date issueDate;
    Date firstIntroDate;
    Date transferDate;
    String transferStatus;
    //cán bộ thực hiện
    String implementationStaff;
    //kiểm soát viên
    String controller;
    //Lãnh đạo ban
    String boardLeader;
    Date expectedExpiryDate;
}
