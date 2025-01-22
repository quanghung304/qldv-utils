package com.agribank.qldvutils.request.tcd_lscd;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdLscdSearchRequest {
    String maso;
    String masoCu;
    String tenCu;
    String hinhThucCu;
    String capTrenCu;
    String masoMoi;
    String tenMoi;
    String hinhThucMoi;
    String capTrenMoi;
    String ngayCd;
    String soCd;
    String capCd;
    String htCd;
    String stt;
    Integer offset;
    Integer limit;
}
