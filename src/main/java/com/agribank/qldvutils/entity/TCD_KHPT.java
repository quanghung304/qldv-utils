package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.TCD_KHPT_ID;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "QLDV_TCD_KHPT")
public class TCD_KHPT {

    @EmbeddedId
    TCD_KHPT_ID id;

    @Column(name = "SL_DANG_KY")
    Integer slDangKy;
}
