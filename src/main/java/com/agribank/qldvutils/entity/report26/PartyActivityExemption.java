package com.agribank.qldvutils.entity.report26;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_party_activity_exemption")
public class PartyActivityExemption extends BaseEntity<String> {
    @Column(name = "committee_decision")
    @Comment("Cấp ủy quyết định")
    String committeeDecision;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực")
    Date effectiveDate;
    @Column(name = "reason")
    @Comment("Lý do")
    String reason;
}
