package com.agribank.qldvutils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfoDto {
    @JsonProperty("TEN_TCD")
    String tenTCD;
    @JsonProperty("MASO_TCD")
    String maSoTCD;
    @JsonProperty("HINH_THUC")
    String hinhThuc;
    @JsonProperty("TEN")
    String ten;
    @JsonProperty("CHUC_VU")
    String chucVu;
    @JsonProperty("QUYEN")
    String quyen;
    @JsonProperty("TEL")
    String tel;
    @JsonProperty("EMAIL")
    String email;
    @JsonProperty("MASO_USER")
    String maSoUser;
    @JsonProperty("MA_QUYEN")
    String maQuyen;
}
