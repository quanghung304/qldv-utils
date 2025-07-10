package com.agribank.qldvutils.request.organization;

import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.OrganizationDraft;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveOrganizationRequest {
    @NotNull
    Organization organization;
    @NotNull
    OrganizationDraft draft;
    @NotNull
    OrganizationHistory history;
}
