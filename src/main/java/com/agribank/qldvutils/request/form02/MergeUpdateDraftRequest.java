package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DvOrgHistoryDraft;
import com.agribank.qldvutils.entity.Request;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDetailDraft;
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
public class MergeUpdateDraftRequest {
    @NotNull
    List<OrganizationMergeDetailDraft> mergeDetailDrafts;
    @NotNull
    List<DvOrgHistoryDraft> membersDraft;
    @NotNull
    Request mergeRequest;
    @NotNull
    OrganizationMergeDraft mergeDraft;
    @NotNull
    List<OrganizationMergeDetailDraft> oldOrganizationMergeDetailDrafts;
    @NotNull
    List<DvOrgHistoryDraft> oldDvOrgHistoryDrafts;
}
