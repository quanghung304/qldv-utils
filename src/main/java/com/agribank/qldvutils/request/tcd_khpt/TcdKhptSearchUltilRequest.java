package com.agribank.qldvutils.request.tcd_khpt;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TcdKhptSearchUltilRequest extends PagingRequest {
    private String maSoTcd;
    private String maSo;
    private String nhiemKy;
    private String nam;
}
