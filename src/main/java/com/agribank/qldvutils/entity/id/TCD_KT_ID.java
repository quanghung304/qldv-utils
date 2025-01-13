package com.agribank.qldvutils.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TCD_KT_ID implements Serializable {
    @Column(name = "MASO")
    String maSo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STT")
    Integer stt;

    @Column(name = "NAM")
    String nam;
}
