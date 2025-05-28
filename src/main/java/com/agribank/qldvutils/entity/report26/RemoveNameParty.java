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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_remove_name_party")
public class RemoveNameParty extends BaseEntity<String> {
    @Column(name = "committee_decision")
    @Comment("Cấp ủy quyết định")
    String committeeDecision;
    @Column(name = "resolution_number")
    @Comment("Số kết luận/nghị quyết")
    String resolutionNumber;
    @Column(name = "resolution_date")
    @Comment("Ngày kết luận/nghị quyết")
    Date resolutionDate;
    @Column(name = "reason")
    @Comment("Lý do ra khỏi Đảng")
    String reason;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực")
    Date effectiveDate;
}
