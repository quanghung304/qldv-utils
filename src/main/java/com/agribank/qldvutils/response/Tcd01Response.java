package com.agribank.qldvutils.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tcd01Response {
    @JsonProperty("maso")
    String maSo;
    @JsonProperty("ten")
    String ten;
    @JsonProperty("hinh_THUC")
    String hinhThuc;
    @JsonProperty("cap_TREN")
    String capTren;
    @JsonProperty("ngay_TL")
    String ngayTl;
    @JsonProperty("so_TL")
    String soTl;
    @JsonProperty("cap_TL")
    String capTl;
    @JsonProperty("ngay_GT")
    String ngayGt;
    @JsonProperty("so_GT")
    String soGt;
    @JsonProperty("cap_GT")
    String capGt;
    @JsonProperty("uy_QUYEN")
    String uyQuyen;
    @JsonProperty("so_QD")
    String soQd;
    @JsonProperty("ngay_QD")
    String ngayQd;
    @JsonProperty("trang_THAI")
    String trangThai;
}
