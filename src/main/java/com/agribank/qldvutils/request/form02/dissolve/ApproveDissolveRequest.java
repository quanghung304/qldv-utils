package com.agribank.qldvutils.request.form02.dissolve;

import com.agribank.qldvutils.entity.form02.dissolve.DissolveDisband;
import com.agribank.qldvutils.entity.form02.dissolve.DissolveDisbandDraft;
import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveDissolveRequest {
    @NotNull
    Organization organization;
    @NotNull
    DissolveDisband dissolve;
    @NotNull
    DissolveDisbandDraft draft;
    @NotNull
    OrganizationHistory history;
}
