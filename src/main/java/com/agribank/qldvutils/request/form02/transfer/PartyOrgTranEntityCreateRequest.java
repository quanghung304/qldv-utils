package com.agribank.qldvutils.request.form02.transfer;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvOrgHistory;
import com.agribank.qldvutils.entity.Organization;
import com.agribank.qldvutils.entity.form02.OrganizationHistory;
import com.agribank.qldvutils.entity.form02.transfer.PartyOrgTransferDetail;
import com.agribank.qldvutils.entity.form02.transfer.PartyOrganizationTransfer;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrgTranEntityCreateRequest {
    PartyOrganizationTransfer partyOrgTransfer;
    @Builder.Default
    List<PartyOrgTransferDetail> partyOrgTransferDetails = new ArrayList<>();
    @Builder.Default
    List<OrganizationHistory> organizationHistories = new ArrayList<>();
    @Builder.Default
    List<Organization> organizations = new ArrayList<>();
    @Builder.Default
    List<DV> dvs = new ArrayList<>();
    @Builder.Default
    List<DvOrgHistory> dvOrgHistories = new ArrayList<>();
}
