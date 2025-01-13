package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_KT_ID;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "QLDV_TCD_KT")
public class TCD_KT {
    @EmbeddedId
    TCD_KT_ID id;

    @Column(name = "CAP_DN")
    String capDn;

    @Column(name = "HINH_THUC_DN")
    String hinhThucDn;

    @Column(name = "KHAC_DN")
    String khacDn;

    @Column(name = "LY_DO_DN")
    String lyDoDn;

    @Column(name = "CAP_QD")
    String capQd;

    @Column(name = "HINH_THUC_QD")
    String hinhThucQd;

    @Column(name = "KHAC_QD")
    String khacQd;

    @Column(name = "LY_DO_QD")
    String lyDoQd;
}
