package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_NSCU_ID;
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
        name = "QLDV_TCD_NSCU"
)
public class TCD_NSCU {
    @EmbeddedId
    TCD_NSCU_ID id;

    @Column(name = "CC_DANG")
    String ccDang;

    @Column(name = "CC_CM")
    String ccCm;

    @Column(name = "SO_LUONG")
    Integer soLuong;

    @Column(name = "SO_LUONG_DH")
    Integer soLuongDh;
}
