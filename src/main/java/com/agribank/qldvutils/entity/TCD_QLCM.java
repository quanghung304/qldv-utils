package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_QLCM_ID;
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
        name = "QLDV_TCD_QLCM"
)
public class TCD_QLCM {
    @EmbeddedId
    TCD_QLCM_ID id;

    @Column(name = "TU_NGAY")
    Date tuNgay;
}
