package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import com.agribank.qldvutils.entity.form02.rename.OrganizationRename;
import com.agribank.qldvutils.entity.form02.rename.OrganizationRenameDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationRenameMetaRequest {
    @NotNull
    Organization organization;
    @NotNull
    OrganizationRename data;
    @NotNull
    OrganizationRenameDraft draft;
    @NotNull
    OrganizationHistory history;
}
