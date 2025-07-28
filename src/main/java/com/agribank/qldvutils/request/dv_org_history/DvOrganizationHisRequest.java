package com.agribank.qldvutils.request.dv_org_history;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvOrganizationHisRequest {
    List<String> newOrgCodes;
    String action;
    String refId;
}
