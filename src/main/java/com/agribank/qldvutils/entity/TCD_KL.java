package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_KL_ID;
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
@Table(name = "QLDV_TCD_KL")
public class TCD_KL {

    @EmbeddedId
    TCD_KL_ID id;

    @Column(name = "NGAY_QD")
    Date ngayQd;

    @Column(name = "NGAY_HL")
    Date ngayHl;

    @Column(name = "CAP_QD")
    String capQd;

    @Column(name = "HINH_THUC")
    String hinhThuc;
}
