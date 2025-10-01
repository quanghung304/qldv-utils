package com.agribank.qldvutils.entity.party_transfer.transfer_temporary;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.EDecisionIssuingUnit;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

//chuyen SHD tam thoi
@Data
@Builder
@Entity
@Table(name = "qldv_transfer_temporary")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransferTemporary extends BaseEntity<String> {

    //----------------- CAP B -----------------//
    @Column(name = "staff_code")
    String staffCode;

    @Column(name = "full_name")
    String fullName; // Ho ten dang vien

    @Column(name = "organization_code")
    @Comment("Ma chi, đảng bộ chuyển đi")
    String organizationCode;

    @Column(name = "organization_name")
    @Comment("Tên Chi, đảng bộ chuyển đi")
    String organizationName;

    @Column(name = "process_id")
    @Comment("khoa ngoai toi bang qldv_transfer_process")
    String processId;

    @Column(name = "decision_number")
    @Comment("Số QĐ")
    String decisionNumber;

    @Column(name = "issue_date")
    @Comment("Ngày ban hành QĐ")
    Date issueDate;

    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực QĐ")
    Date effectiveDate;

    @Column(name = "decision_issuing_unit")
    @Comment("Đơn vị ban hành QĐ: BTV Đảng ủy Agribank/ HĐTV/ Chủ tịch HĐTV/ TGĐ/ Khác")
    @Enumerated(EnumType.STRING)
    EDecisionIssuingUnit decisionIssuingUnit;

    @Column(name = "decision_issuing_unit_other")
    @Comment("Đơn vị ban hành QĐ khác")
    String decisionIssuingUnitOther;

    @Column(name = "issuing_organization_name")
    @Comment("Tên đơn vị ban hành QĐ: BTV Đảng ủy Agribank/ HĐTV/ Chủ tịch HĐTV/ TGĐ")
    String issuingOrganizationName;

    @Column(name = "reason")
    @Comment("Lý do: Trưng tập/Cử đi học dài hạn/Biệt phái/Khác (tự đăng nhập)")
    String reason;

    @Column(name = "party_cell_request_date")
    @Comment("Ngày, tháng, năm chi bộ đề nghị CSHĐ")
    Date partyCellRequestDate;

    @Column(name = "party_cell_request_number")
    @Comment("Số văn bản của chi bộ đề nghị")
    String partyCellRequestNumber;

    @Column(name = "party_committee_request_date")
    @Comment("Ngày, tháng, năm đảng ủy cơ sở đề nghị CSHĐ")
    Date partyCommitteeRequestDate;

    @Column(name = "party_committee_request_number")
    @Comment("Số tờ trình của đảng ủy đề nghị")
    String partyCommitteeRequestNumber;

    //------------ DANG UY -------------//
    @Column(name = "transfer_referral_number")
    @Comment("Số GGTSHĐ")
    String transferReferralNumber;

    @Column(name = "sign_transfer_referral_date")
    @Comment("Ngày ký GGT chuyển đi")
    Date signTransferReferralDate;

    @Column(name = "start_transfer_temporary_date")
    @Comment("Thời gian chuyển SHĐ tạm thời: từ ngày")
    Date startTransferTemporaryDate;

    @Column(name = "end_transfer_temporary_date")
    @Comment("Thời gian chuyển SHĐ tạm thời: đến ngày")
    Date endTransferTemporaryDate;

    @Column(name = "extend_end_transfer_temporary_date")
    @Comment("Thời gian chuyển SHĐ tạm thời: đến ngày gia hạn")
    Date extendEndTransferTemporaryDate;

    @Column(name = "receipt_date")
    @Comment("Ngày tiếp nhận")
    Date receiptDate;

    @Column(name = "receiving_org_code")
    @Comment("Chi, đảng bộ chuyển đến (trường hợp chuyển trong đảng bộ Agribank)")
    String receivingOrgCode;

    @Column(name = "receiving_org_name")
    @Comment("Tên Chi, đảng bộ chuyển đến (trường hợp chuyển trong đảng bộ Agribank)")
    String receivingOrgName;

    @Column(name = "receiving_out_org_name")
    @Comment("Tên chi, đảng bộ chuyển đến (trường hợp chuyển ra ngoài đảng bộ Agribank)")
    String receivingOutOrgName;

}
