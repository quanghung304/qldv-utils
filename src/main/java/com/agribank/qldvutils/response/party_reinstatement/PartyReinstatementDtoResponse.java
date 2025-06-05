package com.agribank.qldvutils.response.party_reinstatement;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyReinstatementDtoResponse {
    String id;
    String fullName;
    String staffCode;
    String conclusionNumber;
    Date conclusionDate;
    String decisionNumber;
    Date decisionDate;
}
