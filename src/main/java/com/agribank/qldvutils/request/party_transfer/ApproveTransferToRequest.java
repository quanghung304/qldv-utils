package com.agribank.qldvutils.request.party_transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.party_transfer.TransferProcess;
import com.agribank.qldvutils.entity.party_transfer.transfer_to.TransferToAgribank;
import com.agribank.qldvutils.entity.party_transfer.transfer_to.TransferToAgribankDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveTransferToRequest {

    @NotNull
    TransferToAgribank transfer;
    @NotNull
    TransferToAgribankDraft draft;
    @NotNull
    DvOrgHistory history;

    DV dv;
    TransferProcess process;
}
