package com.agribank.qldvutils.request.report_tcd;

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
public class SearchBCDSRequest extends PagingRequest {
    String code;
    Date fromDate;
    Date toDate;
}
