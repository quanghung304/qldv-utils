package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMerge;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDetail;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveUpdateUnifyRequest {
    @NotNull
    List<OrganizationMergeDetail> newOrganizationMergeDetails;
    @NotNull
    List<OrganizationMergeDetail> oldOrganizationMergeDetails;
    @NotNull
    List<Organization> oldMergedOrganizations;
    @NotNull
    List<Organization> newMergedOrganizations;
    @NotNull
    OrganizationMerge organizationMerge;
    @NotNull
    OrganizationMergeDraft mergeDraft;
    @NotNull
    List<DvOrgHistory> oldDvOrgHistories;
    @NotNull
    List<DvOrgHistory> newDvOrgHistories;
    @NotNull
    List<OrganizationHistory> newOrganizationHistories;
    @NotNull
    List<OrganizationHistory> oldOrganizationHistories;
    @NotNull
    List<DV> oldDVs;
    @NotNull
    List<DV> newDVs;
    @NotNull
    Organization newOrganization;
    @NotNull
    Organization oldOrganization;
}
