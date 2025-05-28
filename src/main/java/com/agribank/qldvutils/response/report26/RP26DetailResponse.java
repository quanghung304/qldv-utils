package com.agribank.qldvutils.response.report26;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RP26DetailResponse {
    String id;
    String organizationCode;
    String staffCode;
    String decisionNumber;
    Date decisionDate;
    Date dateOfDeath;
    String committeeDecision;
    Date effectiveDate;
    String reason;
    String resolutionNumber;
    Date resolutionDate;
}
