package com.agribank.qldvutils.entity;

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
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_dv_org_history")
public class DvOrgHistory extends BaseEntity<String> {
    @Column(name = "staff_code", nullable = false)
    String staffCode;
    @Column(name = "old_org_code")
    String oldOrgCode;
    @Column(name = "new_org_code")
    String newOrgCode;
    @Column(name = "reference_id")
    @Comment("refer toi bang qldv_organization_merge")
    String refId;
    @Column(name = "effective_date")
    Date effectiveDate;
    @Column(name = "action")
    String action;
}
