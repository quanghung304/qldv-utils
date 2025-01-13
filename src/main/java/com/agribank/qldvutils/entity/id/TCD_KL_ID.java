package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class TCD_KL_ID implements Serializable {
    @Column(name = "MASO")
    private String maSo;

    @Column(name = "SO_QD")
    private String soQd;
}
