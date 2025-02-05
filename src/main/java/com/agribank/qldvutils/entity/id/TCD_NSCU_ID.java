package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;


@Data
@Embeddable
public class TCD_NSCU_ID implements Serializable {
    @Column(name = "MASO")
    private String maSo;

    @Column(name = "NHIEM_KY")
    private String nhiemKy;

    @Column(name = "STT")
    private Integer stt;

    @Column(name = "CD_DEAN")
    private String cdDean;
}
