package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.entity.DvOrgHistoryDraft;
import com.agribank.qldvutils.entity.Request;
import com.agribank.qldvutils.entity.form02.merge.OrganizationMergeDetailDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MergeDraftRequest {
    @NotNull
    List<OrganizationMergeDetailDraft> mergeDetailDrafts;
    @NotNull
    List<DvOrgHistoryDraft> membersDraft;
    @NotNull
    Request mergeRequest;
}
