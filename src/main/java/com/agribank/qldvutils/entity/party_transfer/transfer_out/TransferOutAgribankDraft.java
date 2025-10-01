package com.agribank.qldvutils.entity.party_transfer.transfer_out;

import com.agribank.qldvutils.entity.BaseDraftEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@Builder
@Entity
@Table(name = "qldv_transfer_out_draft")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen sinh hoat dang den dang bo Agribank
public class TransferOutAgribankDraft extends BaseDraftEntity {
    @Column(name = "staff_code")
    String staffCode;
    String fullName;
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
    @Comment("Ngày chi bộ đề nghị CSHĐ")
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

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("staffCode", "Mã cán bộ");
                put("fullName", "Họ tên");
                put("decisionNumber", "Số Quyết định");
                put("issueDate", "Ngày ban hành");
                put("effectiveDate", "Ngày hiệu lực");
                put("reason", "Lý do chuyển sinh hoạt");
                put("issuingOrganization", "Đơn vị ban hành QĐ");
                put("orgCProposeDate", "Ngày chi bộ đề nghị CSHĐ");
                put("orgCProposeNumber", "Số văn bản");
                put("orgBProposeDate", "Ngày ĐUCS đề nghị CSHĐ");
                put("orgBProposeNumber", "Số tờ trình");
                put("expectedExpiryDate", "Ngày dự kiến hết hạn chuyển sinh hoạt đảng");
                put("introDocumentNumber", "Số giấy giới thiệu chuyển SHĐ");
                put("transferDate", "Ngày chuyển đi");
                put("receivedOrganization", "Đảng bộ nơi ĐV chuyển đến");
            }}
    );
}
