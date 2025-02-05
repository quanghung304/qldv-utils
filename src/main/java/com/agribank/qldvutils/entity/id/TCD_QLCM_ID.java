package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TCD_QLCM_ID implements Serializable {
    @Column(name = "MASO")
    String maSo;

    @Column(name = "MASO_CM")
    String maSoCm;
}
