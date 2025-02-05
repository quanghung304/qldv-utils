package com.agribank.qldvutils.request.tcd_daotao;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TcdDaoTaoSearchUltilRequest extends PagingRequest {
    private String maSo;
    private String maSoTcd;
    private String ten;
    private String khoaHoc;
}
