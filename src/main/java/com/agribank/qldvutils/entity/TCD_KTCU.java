package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_KTCU_ID;
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
@Table(name = "QLDV_TCD_KTCU")
public class TCD_KTCU {
    @EmbeddedId
    TCD_KTCU_ID id;

    @Column(name = "NGAY_DN")
    Date ngayDn;

    @Column(name = "NGHIEP_VU")
    String nghiepVu;

    @Column(name = "KHAC")
    String khac;

    @Column(name = "TRANG_THAI_HS")
    String trangThaiHS;

    @Column(name = "CD_KT")
    String cdKt;

    @Column(name = "NGAY_TRINH_BTV")
    Date ngayTrinhBtv;

    @Column(name = "SO_VB_XP")
    String soVbXp;

    @Column(name = "NGAY_XP")
    Date ngayXp;

    @Column(name = "SO_PHIEU")
    Integer soPhieu;

    @Column(name = "SO_KL")
    String soKl;

    @Column(name = "NGAY_KL")
    Date ngayKl;

    @Column(name = "SO_QD")
    String soQd;

    @Column(name = "NGAY_QD")
    Date ngayQd;

    @Column(name = "TRANG_THAI")
    String trangThai;
}
