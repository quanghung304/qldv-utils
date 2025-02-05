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
public class TCD_DAOTAO_ID implements Serializable {
    @Column(name = "MASO")
    String maSo;

    @Column(name = "STT")
    Integer stt;
}
