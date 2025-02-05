package com.agribank.qldvutils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TcdNscuDto {
    @JsonProperty("MASO")
    private String maSo;

    @JsonProperty("NHIEM_KY")
    private String nhiemKy;

    @JsonProperty("STT")
    private Integer stt;

    @JsonProperty("CD_DEAN")
    private String cdDean;

    @JsonProperty("CC_DANG")
    String ccDang;

    @JsonProperty("CC_CM")
    String ccCm;

    @JsonProperty("SO_LUONG")
    Integer soLuong;

    @JsonProperty("SO_LUONG_DH")
    Integer soLuongDh;
}
