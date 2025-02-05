package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_QH_ID;
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
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "QLDV_TCD_QH"
)
public class TCD_QH {
    @EmbeddedId
    TCD_QH_ID id;

    @Column(name = "NHIEM_KY")
    String nhiemKy;

    @Column(name = "NGAY_TRINH")
    Date ngayTrinh;

    @Column(name = "TRANG_THAI_HS")
    String trangThaiHs;

    @Column(name = "NGAY_HT_HS")
    Date ngayHtHs;

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
