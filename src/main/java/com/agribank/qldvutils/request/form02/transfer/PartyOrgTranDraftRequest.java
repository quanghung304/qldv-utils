package com.agribank.qldvutils.request.form02.transfer;

import com.agribank.qldvutils.entity.Request;
import com.agribank.qldvutils.entity.form02.transfer.PartyOrgTransferDetailDraft;
import com.agribank.qldvutils.entity.form02.transfer.PartyOrganizationTransferDraft;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrgTranDraftRequest {
    PartyOrganizationTransferDraft partyOrganizationTransferDraft;
    @Builder.Default
    List<PartyOrgTransferDetailDraft> partyOrgTransferDetailDrafts = new ArrayList<>();
    Request request;
}
