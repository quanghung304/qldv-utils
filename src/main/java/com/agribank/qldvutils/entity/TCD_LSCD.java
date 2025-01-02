package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_LSCD_ID;
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
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "QLDV_TCD_LSCD"
)
public class TCD_LSCD {
    @EmbeddedId
    TCD_LSCD_ID id;
    @Column(name = "TEN_CU")
    String tenCu;
    @Column(name = "HINH_THUC_CU")
    String hinhThucCu;
    @Column(name = "CAP_TREN_CU")
    String capTrenCu;
    @Column(name = "MASO_MOI")
    String maSoCu;
    @Column(name = "TEN_MOI")
    String tenMoi;
    @Column(name = "HINH_THUC_MOI")
    String hinhThucMoi;
    @Column(name = "CAP_TREN_MOI")
    String capTrenMoi;
    @Column(name = "NGAY_CD")
    String ngayChuyenDoi;
    @Column(name = "SO_CD")
    String soQuyetDinh;
    @Column(name = "CAP_CD")
    String capQuyetDinh;
    @Column(name = "HT_CD")
    String hinhThucChuyenDoi;
}
