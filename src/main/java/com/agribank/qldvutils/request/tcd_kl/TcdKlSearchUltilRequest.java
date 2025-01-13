package com.agribank.qldvutils.request.tcd_kl;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TcdKlSearchUltilRequest extends PagingRequest {
    private String maSoTcdl;
    private String maSo;
}
