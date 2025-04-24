package com.agribank.qldvutils.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    Integer id;
    String userId;
    Integer brcd;
    String username;
    String fullName;
    String email;
    String address;
    String phone;
    Integer vneid;
    Integer gender;
    Integer staffCode;
    String jobPosition;
    Integer active;
    String createdBy;
    String userCreated;
    Integer depId;
}
