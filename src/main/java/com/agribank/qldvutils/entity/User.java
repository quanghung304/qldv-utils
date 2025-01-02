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
@Table(name = "QLDV_HT_NSD")
public class User {
    @Id
    @Column(name = "MASO")
    String maSo;
    @Column(name = "MASO_TCD")
    String maSoTCD;
    @Column(name = "TEN")
    String ten;
    @Column(name = "QUYEN")
    String quyen;
    @Column(name = "CHUC_VU")
    String chucVu;
    @Column(name = "MAT_KHAU")
    String matKhau;
    @Column(name = "NGAY_MAT_KHAU")
    String ngayMatKhau;
    @Column(name = "MASO_THAM_CHIEU")
    String maSoThamChieu;
    @Column(name = "TEL")
    String tel;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "TRANG_THAI")
    String trangThai;
}
