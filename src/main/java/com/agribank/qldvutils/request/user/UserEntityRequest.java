package com.agribank.qldvutils.request.user;

import com.agribank.qldvutils.entity.Staff;
import com.agribank.qldvutils.entity.User;
import com.agribank.qldvutils.entity.UserRole;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntityRequest {
    Staff staff;
    User user;
    List<UserRole> userRoles;
}
