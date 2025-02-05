package com.agribank.qldvutils.request.tcd_qh;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdQhSearchUltilRequest extends PagingRequest {
    private String maSoTcdl;
    private String maSo;
    private String nhiemKy;
    private String trangThai;
    private String trangThaiHs;
}
