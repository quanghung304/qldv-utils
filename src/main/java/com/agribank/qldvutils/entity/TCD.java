package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "QLDV_TCD")
public class TCD {
    @Id
    @Column(name = "MASO")
    String maSo;
    @Column(name = "TEN")
    String ten;
    @Column(name = "HINH_THUC")
    String hinhThuc;
    @Column(name = "CAP_TREN")
    String capTren;
    @Column(name = "NGAY_TL")
    Date ngayThanhLap;
    @Column(name = "SO_TL")
    String soThanhLap;
    @Column(name = "CAP_TL")
    String capThanhLap;
    @Column(name = "NGAY_GT")
    Date ngayGiaiThe;
    @Column(name = "SO_GT")
    String soGiaiThe;
    @Column(name = "CAP_GT")
    String capGiaiThe;
    @Column(name = "UY_QUYEN")
    String uyQuyen; //dược ủy quyền kết nạp, khai trừ
    @Column(name = "SO_QD")
    String soUyQuyen;
    @Column(name = "NGAY_QD")
    Date ngayUyQuyen;
    @Column(name = "TRANG_THAI")
    String trangThai;
}
