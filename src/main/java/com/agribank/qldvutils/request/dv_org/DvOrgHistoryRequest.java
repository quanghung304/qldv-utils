package com.agribank.qldvutils.request.dv_org;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvOrgHistoryRequest {
    String staffCode;
    String refId;
}
