package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
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
        name = "QLDV_TCD"
)
public class Tcd01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MASO")
    String maSo;

    @Column(name = "TEN")
    String ten;

    @Column(name = "HINH_THUC")
    String hinhThuc;

    @Column(name = "CAP_TREN")
    String capTren;

    @Column(name = "NGAY_TL")
    Date ngayTl;

    @Column(name = "SO_TL")
    String soTl;

    @Column(name = "CAP_TL")
    String capTl;

    @Column(name = "NGAY_GT")
    Date ngayGt;

    @Column(name = "SO_GT")
    String soGt;

    @Column(name = "CAP_GT")
    String capGt;

    @Column(name = "UY_QUYEN")
    String uyQuyen;

    @Column(name = "SO_QD")
    String soQd;

    @Column(name = "NGAY_QD")
    Date ngayQd;

    @Column(name = "TRANG_THAI")
    String trangThai;
}
