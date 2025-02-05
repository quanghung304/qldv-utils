package com.agribank.qldvutils.request.tcd_nscu;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TcdNscuSearchUtilRequest extends PagingRequest {
    private String maSoTcd;
    private String maSo;
    private String nhiemKy;
}
