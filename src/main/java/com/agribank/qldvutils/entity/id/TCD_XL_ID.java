package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class TCD_XL_ID implements Serializable {
    @Column(name = "MASO")
    private String maSo;
    @Column(name = "NAM")
    private String nam;
}
