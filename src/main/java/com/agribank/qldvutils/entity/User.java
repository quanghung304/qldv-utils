package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

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
    String ten;
    String quyen;
    @Column(name = "CHUC_VU")
    String chucVu;
    @Column(name = "MAT_KHAU")
    String matKhau;
    @Column(name = "NGAY_MAT_KHAU")
    String ngayMatKhau;
    @Column(name = "MASO_THAM_CHIEU")
    String maSoThamChieu;
    String tel;
    String email;
    @Column(name = "TRANG_THAI")
    String trangThai;
    @Column(name = "NGAY_TAO")
    Date ngayTao;
    @Column(name = "NGAY_SUA")
    Date ngaySua;

    @PrePersist
    private void onCreate() {
        ngayTao = new Date(System.currentTimeMillis());
        ngaySua = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    private void onUpdate() {
        ngaySua = new Date(System.currentTimeMillis());
    }
}
