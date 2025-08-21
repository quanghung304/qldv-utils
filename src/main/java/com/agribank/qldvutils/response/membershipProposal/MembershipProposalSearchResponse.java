package com.agribank.qldvutils.response.membershipProposal;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MembershipProposalSearchResponse {
    String id;
    String staffCode;
    String fullName;
    String username;
    String reason;
    String resolutionNumber;
    Date resolutionDate;
    String decisionNumber;
    Date decisionDate;
    String vneid;
    String organizationCodeB;
    String organizationCodeC;
    String organizationNameB;
    String organizationNameC;
}
