package com.agribank.qldvutils.entity.form02;

import com.agribank.qldvutils.entity.BaseCodeEntity;
import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "qldv_organization_history", schema = Constants.DV_DL)
public class OrganizationHistory extends BaseEntity<String> {
    String code;
    @Comment("ten chi, dang bo")
    String name;
    @Comment("0: thanh lap, 1: nang cap, 2: ha cap, 3: chia tach, 4: sap nhap, 5: hop nhat, 6: giai the, 7: giai tan")
    Integer type;
    @Column(name = "ref_id")
    @Comment("khoa ngoai toi bang luu ho so tuong ung")
    String refId;
    @Column(name = "effective_date")
    Date effectiveDate;
    @Column(name = "last_action")
    @Comment("Y/N")
    String lastAction;
}
