package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_membership_proposal")
public class MembershipProposal extends BaseEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    @Column(name = "staff_code")
    String staffCode;
    String reason;
    //Số kết luận nghị quyết
    @Column(name = "resolution_number")
    String resolutionNumber;
    //Ngày kết luận nghị quyết
    @Column(name = "resolution_date")
    Date resolutionDate;
    //Số quyết định
    @Column(name = "decision_number")
    String decisionNumber;
    //Ngày QĐ
    @Column(name = "decision_date")
    Date decisionDate;
    @Builder.Default
    Integer deleted = 0;
}
