package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DvOrgHistoryDraft;
import com.agribank.qldvutils.entity.Request;
import com.agribank.qldvutils.entity.form02.split.OrganizationSplitDetailDraft;
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
public class SplitUpdateDraftRequest {
    @NotNull
    List<OrganizationSplitDetailDraft> splitDetailDrafts;
    @NotNull
    List<DvOrgHistoryDraft> membersDraft;
    @NotNull
    Request splitRequest;
    @NotNull
    OrganizationSplitDraft splitDraft;
    @NotNull
    List<OrganizationSplitDetailDraft> oldOrganizationSplitDetailDrafts;
    @NotNull
    List<DvOrgHistoryDraft> oldDvOrgHistoryDrafts;
}
