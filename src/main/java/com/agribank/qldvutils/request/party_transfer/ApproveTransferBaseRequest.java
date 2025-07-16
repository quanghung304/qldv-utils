package com.agribank.qldvutils.request.party_transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.party_transfer.TransferProcess;
import com.agribank.qldvutils.entity.party_transfer.transfer_within_base.TransferWithinBase;
import com.agribank.qldvutils.entity.party_transfer.transfer_within_base.TransferWithinBaseDraft;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApproveTransferBaseRequest {
    TransferWithinBase transfer;
    @NotNull
    TransferWithinBaseDraft draft;
    @NotNull
    DvOrgHistory history;

    DV dv;
}
