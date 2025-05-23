package com.agribank.qldvutils.request;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FilterRequest extends PagingRequest {
    @NotNull(message = "Khong duoc bo trong type")
    Integer type;
    String organizationCode;
    String formCode;
    String createdBy;
    String approvedBy;
    Integer status;
    Date createdAt;
}
