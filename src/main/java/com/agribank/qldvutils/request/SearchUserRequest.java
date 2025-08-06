package com.agribank.qldvutils.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchUserRequest extends PagingRequest {
    String name;
    String organizationCode;
    Integer active;
    Integer delete;

    @Override
    public void validate() {
        super.validate();
    }
}
