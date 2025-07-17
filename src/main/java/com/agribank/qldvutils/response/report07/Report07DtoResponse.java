package com.agribank.qldvutils.response.report07;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report07DtoResponse {
    String organizationName;
    String form;
    Integer total;
    Integer male;
    Integer female;
    Integer totalEthnic;
    Integer chineseEthnic;
    Integer religion;
    Integer martyrFamily;
    Integer revolution;
    Integer inArmy;
    Integer disabled;
    Integer formerWorker;
    Integer politicalIssue;
    Integer foreignMarriage;
    Integer foreignRelated;
    Integer violateBirthPlan;
}
