package com.agribank.qldvutils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tcd05Dto {
    @JsonProperty("SO")
    String so;

    @JsonProperty("NHIEM_KY")
    String nhiemKy;

    @JsonProperty("LAN")
    Integer lan;

    @JsonProperty("NGAY_TRINH")
    Date ngayTrinh;

    @JsonProperty("TRANG_THAI_HS")
    String trangThaiHs;

    @JsonProperty("NGAY_HT_HS")
    Date ngayHtHs;

    @JsonProperty("NGAY_TRINH_BTV")
    Date ngayTrinhBtv;

    @JsonProperty("SO_VB_XP")
    String soVbXp;

    @JsonProperty("NGAY_XP")
    String ngayXp;

    @JsonProperty("SO_PHIEU")
    String soPhieu;

    @JsonProperty("SO_KL")
    String soKl;

    @JsonProperty("NGAY_KL")
    Date ngayKl;

    @JsonProperty("SO_QD")
    String soQd;

    @JsonProperty("NGAY_QD")
    Date ngayQd;

    @JsonProperty("TRANG_THAI")
    String trangThai;

    @JsonProperty("HS_NGAY")
    String hsNgay;

    @JsonProperty("HS_MA_HS")
    String hsMaHs;

    @JsonProperty("HS_TRANG_THAI")
    String hsTrangThai;

    @JsonProperty("HS_TEN_HS")
    String hsTenHs;
}
