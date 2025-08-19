package com.agribank.qldvutils.entity.party_transfer.transfer_out;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "qldv_transfer_out_agribank", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen SHD ra ngoai dang bo Agribank
public class TransferOutAgribank extends BaseEntity<String> {
    @Column(name = "staff_code")
    String staffCode;
    String fullName;
    @Column(name = "process_id")
    @Comment("khoa ngoai toi bang qldv_transfer_process")
    String processId;
    @Column(name = "decision_number")
    @Comment("Số Quyết định")
    String decisionNumber;
    @Column(name = "issue_date")
    @Comment("Ngày ban hành QĐ")
    Date issueDate;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực QĐ")
    Date effectiveDate;
    String reason;
    @Column(name = "issuing_organization")
    @Comment("Đơn vị ban hành QĐ: BTV Đảng ủy Agribank/ HĐTV/ Chủ tịch HĐTV/ TGĐ")
    String issuingOrganization;
    @Column(name = "org_c_propose_date")
    @Comment("Ngày, tháng, năm chi bộ đề nghị CSHĐ")
    Date orgCProposeDate;
    @Column(name = "org_c_propose_number")
    @Comment("Số văn bản")
    String orgCProposeNumber;
    @Column(name = "org_b_propose_date")
    @Comment("Ngày, tháng, năm ĐUCS đề nghị CSHĐ")
    Date orgBProposeDate;
    @Column(name = "org_b_propose_number")
    @Comment("Số tờ trình")
    String orgBProposeNumber;
    @Column(name = "expected_expiry_date")
    @Comment("Ngày dự kiến hết hạn chuyển sinh hoạt đảng")
    Date expectedExpiryDate;
    @Column(name = "intro_document_number")
    @Comment("Số giấy giới thiệu chuyển SHĐ")
    String introDocumentNumber;
    @Column(name = "transfer_date")
    @Comment("Ngày chuyển đi")
    Date transferDate;
    @Column(name = "received_organization")
    @Comment("Đảng bộ nơi ĐV chuyển đến")
    String receivedOrganization;
}
