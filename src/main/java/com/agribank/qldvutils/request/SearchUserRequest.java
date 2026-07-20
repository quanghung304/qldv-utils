package com.agribank.qldvutils.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchUserRequest extends PagingRequest {
    String name;
    String organizationCode;
    Integer active;
    Integer delete;
    Integer brcd;
    String roleId;
    String status;
    String keyword;
}
