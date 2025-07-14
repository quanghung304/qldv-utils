package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.Organization;
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
public class ApproveSplitRequest {
    @NotNull
    List<OrganizationSplitDetail> organizationSplitDetails;
    @NotNull
    List<Organization> newOrganizations;
    @NotNull
    List<Organization> oldOrganizations;
    @NotNull
    OrganizationSplitDraft splitDraft;
    @NotNull
    List<DvOrgHistory> dvOrgHistories;
    @NotNull
    List<DV> newDVs;
}
