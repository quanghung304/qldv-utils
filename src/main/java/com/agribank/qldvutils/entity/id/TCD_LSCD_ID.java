package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class TCD_LSCD_ID implements Serializable {
    @Column(name = "MASO_CU")
    private String maSoCu; //Mã tổ chức đảng cũ
    private String sTT; //Số thứ tự tăng dần theo MASO_CU
}
