package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_XL_ID;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "QLDV_TCD_XL")
public class TCD_XL {
    @EmbeddedId
    TCD_XL_ID id;

    @Column(name = "XEP_LOAI_DN")
    String xepLoaiDn;

    @Column(name = "CAP_QD")
    String capQd;

    @Column(name = "XEP_LOAI_QD")
    String xepLoaiQd;

    @Column(name = "SO_QD")
    String soQd;

    @Column(name = "NGAY_QD")
    Date ngayQd;

    @Column(name = "XEP_LOAI_CM")
    String xepLoaiCm;

    @Column(name = "CAP_QD_CM")
    String capQdCm;
}
