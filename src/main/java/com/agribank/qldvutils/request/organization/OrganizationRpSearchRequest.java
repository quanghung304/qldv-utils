package com.agribank.qldvutils.request.organization;

import com.agribank.qldvutils.request.PagingRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationRpSearchRequest extends PagingRequest {
    String code;
    @NotNull(message = "form is required")
    @NotBlank(message = "form is not blank")
    String form;
    Date fromDate;
    Date toDate;
}
