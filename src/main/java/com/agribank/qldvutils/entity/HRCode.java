package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.entity.id.HRCode_ID;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "tbga_hrjoin", schema = Constants.MIS_DL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HRCode {
    @EmbeddedId
    HRCode_ID id;
    @Column(name = "cdnm")
    String codeName;
    String note;
    @Column(name = "cdnmeng")
    String engCodeName;
}
