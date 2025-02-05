package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_DAOTAO_ID;
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
@Table(name = "QLDV_TCD_DAOTAO")
public class TCD_DAOTAO {
    @EmbeddedId
    TCD_DAOTAO_ID id;

    @Column(name = "TEN")
    String ten;

    @Column(name = "KHOA_HOC")
    String khoaHoc;

    @Column(name = "NGAY")
    Date ngay;

    @Column(name = "SO_NGAY")
    Integer soNgay;

    @Column(name = "SO_NGUOI")
    Integer soNguoi;

    @Column(name = "ND_1")
    String nd1;

    @Column(name = "ND_2")
    String nd2;

    @Column(name = "ND_3")
    String nd3;

    @Column(name = "ND_4")
    String nd4;

    @Column(name = "ND_5")
    String nd5;

    @Column(name = "ND_6")
    String nd6;

    @Column(name = "NOI_DUNG_KHAC")
    String noiDungKhac;
}
