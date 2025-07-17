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
public class SearchRp07Request extends PagingRequest {
    String organizationCode;
    int form;
    int type;
    Date toDate;
}
