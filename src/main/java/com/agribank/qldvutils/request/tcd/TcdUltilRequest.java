package com.agribank.qldvutils.request.tcd;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdUltilRequest {
    @JsonProperty("MASO")
    String maSo;
    @JsonProperty("TEN")
    String ten;
    @JsonProperty("HINH_THUC")
    String hinhThuc;
    @JsonProperty("CAP_TREN")
    String capTren;
    @JsonProperty("NGAY_TL")
    Date ngayTl;
    @JsonProperty("SO_TL")
    String soTl;
    @JsonProperty("CAP_TL")
    String capTl;
    @JsonProperty("NGAY_GT")
    Date ngayGt;
    @JsonProperty("SO_GT")
    String soGt;
    @JsonProperty("CAP_GT")
    String capGt;
    @JsonProperty("UY_QUYEN")
    String uyQuyen;
    @JsonProperty("SO_QD")
    String soQd;
    @JsonProperty("NGAY_QD")
    Date ngayQd;
    @JsonProperty("TRANG_THAI")
    String trangThai;
}
