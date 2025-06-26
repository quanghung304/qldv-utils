package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_dv_org_history", schema = Constants.DV_DL)
public class DvOrgHistory extends BaseEntity<String> {
    @Column(name = "staff_code", unique = true, nullable = false)
    String staffCode;
    @Column(name = "old_org_code")
    String oldOrgCode;
    @Column(name = "new_org_code")
    String newOrgCode;
}
