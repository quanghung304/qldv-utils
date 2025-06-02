package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_membership_proposal_draft")
public class MembershipProposalDraft extends BaseEntity<String>{
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
    Integer status;
    @Column(name = "created_by")
    String createdBy ;
    @Column(name = "approved_by")
    String approvedBy;
    @Column(name = "ref_id")
    String refId;
    @Column(name = "full_name")
    String fullName;

    public static Map<String, String> FIELD_MAP = Map.of(
            "organizationCode", "Mã chi, đảng bộ",
            "staffCode", "Mã nhân viên",
            "reason", "Lý do kết nạp lần 2",
            "resolutionNumber", "Số kết luận nghị quyết",
            "resolutionDate", "Ngày kết luận nghị quyết",
            "decisionNumber", "Số quyết định",
            "decisionDate", "Ngày quyết định",
            "fullName", "Họ tên"
    );
}
