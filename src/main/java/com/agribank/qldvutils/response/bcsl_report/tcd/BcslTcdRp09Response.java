package com.agribank.qldvutils.response.bcsl_report.tcd;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BcslTcdRp09Response {
    String organizationCode;
    String organizationName;
    @Builder.Default
    Integer partyMember = 0;
    @Builder.Default
    Integer preliminaryPartyMember = 0;
    @Builder.Default
    Integer fullPartyMember = 0;
    @Builder.Default
    Integer newPartyMember = 0;
    @Builder.Default
    Integer reissuePartyCard1 = 0;
    @Builder.Default
    Integer reissuePartyCard2 = 0;
    @Builder.Default
    Integer reissuePartyCard3 = 0;
    @Builder.Default
    Integer lost = 0;
    @Builder.Default
    Integer broken = 0;
    @Builder.Default
    Integer otherReason = 0;
    @Builder.Default
    Integer notPartyCard = 0;
    @Builder.Default
    Integer admission2 = 0;
    @Builder.Default
    Integer reinstatement = 0;
    @Builder.Default
    Integer suggestionUnion = 0;
    @Builder.Default
    Integer suggestionYouthUnion = 0;
    @Builder.Default
    Integer student = 0;
    @Builder.Default
    Integer nonAgribankParty = 0;
    String typeName;
}
