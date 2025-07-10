package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import com.agribank.qldvutils.entity.form02.updown.OrganizationUpDown;
import com.agribank.qldvutils.entity.form02.updown.OrganizationUpDownDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AprroveUpDownRequest {
    @NotNull
    Organization organization;
    @NotNull
    OrganizationUpDown upDown;
    @NotNull
    OrganizationUpDownDraft draft;
    @NotNull
    OrganizationHistory history;
}
