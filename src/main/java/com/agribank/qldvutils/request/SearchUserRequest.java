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
    private static final List<String> VALID_STATUSES = List.of("ACTIVE", "LOCKED", "INACTIVE");

    String name;
    String organizationCode;
    Integer active;
    Integer delete;
    Integer brcd;
    String roleId;
    String status;
    String keyword;

    @Override
    public void validate() {
        super.validate();
        if (Objects.nonNull(status)) {
            status = status.trim();
            if (status.isBlank()) {
                status = null;
                return;
            }
            status = status.toUpperCase();
            if (!VALID_STATUSES.contains(status)) {
                throw new IllegalArgumentException("status must be ACTIVE or LOCKED");
            }
        }
    }
}
