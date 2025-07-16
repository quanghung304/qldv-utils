package com.agribank.qldvutils.request.party_transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.party_transfer.TransferProcess;
import com.agribank.qldvutils.entity.party_transfer.transfer_within_agribank.TransferWithinAgribank;
import com.agribank.qldvutils.entity.party_transfer.transfer_within_agribank.TransferWithinAgribankDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveTransferWithinRequest {

    @NotNull
    TransferWithinAgribank transfer;
    @NotNull
    TransferWithinAgribankDraft draft;
    @NotNull
    DvOrgHistory history;

    DV dv;
    TransferProcess process;
}
