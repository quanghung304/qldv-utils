package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.EstablishmentDissolve;
import com.agribank.qldvutils.entity.EstablishmentDissolveDraft;
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
    EstablishmentDissolve dissolve;
    @NotNull
    EstablishmentDissolveDraft draft;
    @NotNull
    OrganizationHistory history;
}
