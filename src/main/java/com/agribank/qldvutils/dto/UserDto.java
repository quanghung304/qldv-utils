package com.agribank.qldvutils.dto;

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
    Integer depId;
    String phone;
    String vneid;
    Integer active;
    Integer deleted;
    String dvStatus;
    String partyOrganizationId;
}
