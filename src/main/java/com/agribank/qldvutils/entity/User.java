package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "QLDV_HT_NSD"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String MASO;
    @Column(name = "MASO_TCD")
    String maSoTCD;
    String TEN;
    String QUYEN;
    @Column(name = "CHUC_VU")
    String chucVu;
    @Column(name = "MAT_KHAU")
    String matKhau;
    @Column(name = "NGAY_MAT_KHAU")
    String ngayMatKhau;
    @Column(name = "MASO_THAM_CHIEU")
    String maSoThamChieu;
    String TEL;
    String EMAIL;
    @Column(name = "TRANG_THAI")
    String trangThai;
}
