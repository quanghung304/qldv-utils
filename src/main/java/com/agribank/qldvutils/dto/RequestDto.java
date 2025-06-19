package com.agribank.qldvutils.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestDto {
    String id;
    Integer type;
    String formCode;
    String formName;
    String organizationCode;
    String organizationName;
    String staffName;
    String oldData;
    String newData;
    Date createdAt;
    String creator;
    Date approvedAt;
    String approver;
    Integer status;
    String deniedReason;
}
