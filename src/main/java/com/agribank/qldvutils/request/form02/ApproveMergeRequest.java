package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDetail;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDraft;
import com.agribank.qldvutils.entity.form02.split.OrganizationSplitDetail;
import com.agribank.qldvutils.entity.form02.split.OrganizationSplitDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveMergeRequest {
    @NotNull
    List<OrganizationMergeDetail> organizationMergeDetails;
    @NotNull
    List<Organization> mergedOrganizations;
    @NotNull
    OrganizationMergeDraft mergeDraft;
    @NotNull
    List<DvOrgHistory> dvOrgHistories;
    @NotNull
    List<DV> mergedMembers;
    @NotNull
    List<OrganizationHistory> organizationHistories;
}
