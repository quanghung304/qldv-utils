package com.agribank.qldvutils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TcdXlDto {
    @JsonProperty("MASO")
    private String maSo;

    @JsonProperty("NAM")
    private String nam;

    @JsonProperty("XEP_LOAI_DN")
    String xepLoaiDn;

    @JsonProperty("CAP_QD")
    String capQd;

    @JsonProperty("XEP_LOAI_QD")
    String xepLoaiQd;

    @JsonProperty("SO_QD")
    String soQd;

    @JsonProperty("NGAY_QD")
    Date ngayQd;

    @JsonProperty("XEP_LOAI_CM")
    String xepLoaiCm;

    @JsonProperty("CAP_QD_CM")
    String capQdCm;
}
