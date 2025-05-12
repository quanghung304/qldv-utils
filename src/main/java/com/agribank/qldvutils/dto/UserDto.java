package com.agribank.qldvutils.dto;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    String id;
    String staffCode;
    String dvCode;
    Integer idIam;
    String username;
    String fullName;
    String email;
    Integer brcd;
    String organizationCode;
    Integer depId;
    String phone;
    String vneid;
    Integer active;
    Integer deleted;
}
