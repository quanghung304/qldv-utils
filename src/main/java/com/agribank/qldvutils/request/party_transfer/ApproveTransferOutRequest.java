package com.agribank.qldvutils.request.party_transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.party_transfer.TransferProcess;
import com.agribank.qldvutils.entity.party_transfer.transfer_out.TransferOutAgribank;
import com.agribank.qldvutils.entity.party_transfer.transfer_out.TransferOutAgribankDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveTransferOutRequest {
    @NotNull
    TransferOutAgribank transfer;
    @NotNull
    TransferOutAgribankDraft draft;
    @NotNull
    DvOrgHistory history;

    DV dv;
    TransferProcess process;

}
