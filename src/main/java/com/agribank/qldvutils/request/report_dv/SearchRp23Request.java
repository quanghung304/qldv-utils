package com.agribank.qldvutils.request.report_dv;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchRp23Request extends PagingRequest {
    String organizationCode;
    Date fromDate;
    Date toDate;
}
