package com.agribank.qldvutils.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchRp33Dto {
    String organizationCode;
    String organizationName;
    String staffCode;
    String fullName;
    Date birthday;
    String mainJob;
    String recruitBrcd;
    //Chức danh cấp ủy
    String partyCommitteeJob;
    String decisionNumber;
    Date effectiveDate;
    Date transferDate;
    String receivingOrgName;
    String createdBy;
    String approvedBy;
    //Lãnh đạo ban
    String boardLeader;
}
