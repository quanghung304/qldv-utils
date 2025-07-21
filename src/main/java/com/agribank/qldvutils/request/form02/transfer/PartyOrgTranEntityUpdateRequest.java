package com.agribank.qldvutils.request.form02.transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.form02.transfer.PartyOrgTransferDetail;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrgTranEntityUpdateRequest extends PartyOrgTranEntityCreateRequest{
    List<PartyOrgTransferDetail> detailsDeleted = new ArrayList<>();
    List<DV> dvResets = new ArrayList<>();
    List<DvOrgHistory> dvOrgHistoryReset = new ArrayList<>();
}
