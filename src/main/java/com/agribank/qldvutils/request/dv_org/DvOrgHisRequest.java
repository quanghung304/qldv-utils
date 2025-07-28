package com.agribank.qldvutils.request.dv_org;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvOrgHisRequest {
    @NotNull(message = "oldOrgCodes is required")
    List<String> oldOrgCodes;
    @NotNull(message = "refId is required")
    @NotBlank(message = "refId is required")
    String refId;
}
