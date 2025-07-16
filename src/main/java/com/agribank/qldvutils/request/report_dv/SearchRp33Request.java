package com.agribank.qldvutils.request.report_dv;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRp33Request extends PagingRequest {
    String organizationCode;
    Date fromDate;
    Date toDate;
}
