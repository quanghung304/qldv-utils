package com.agribank.qldvutils.response.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchResponse {
    String id;
    Integer idIam;
    String username;
    String fullName;
    String email;
    Integer brcd;
    String vneid;
    String staffCode;
    Integer active;
    String branchName;
    List<String> roles;
    String organizationCodeB;
    String organizationCodeC;
    String organizationNameB;
    String organizationNameC;
    String userId;
    Integer unitId;
    String unitName;
    String roleId;
    String roleName;
    String accountStatus;
    Timestamp createdAt;
}
