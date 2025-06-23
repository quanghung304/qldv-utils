package com.agribank.qldvutils.entity.party_transfer.transfer_within_base;

import com.agribank.qldvutils.entity.BaseDraftEntity;
import com.agribank.qldvutils.enums.Constants;
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
@Table(name = "qldv_transfer_within_base_draft", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen SHD trong dang bo co so
public class TransferWithinBaseDraft extends BaseDraftEntity {
    @Column(name = "staff_code")
    String staffCode;
    String fullName;
    @Column(name = "decision_number")
    @Comment("Số Quyết định chuyển công tác")
    String decisionNumber;
    @Column(name = "issue_date")
    @Comment("Ngày ban hành QĐ")
    Date issueDate;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực QĐ")
    Date effectiveDate;
    @Column(name = "issuing_organization")
    @Comment("Đơn vị ban hành QĐ: GĐ CN loại I/ loại II")
    String issuingOrganization;
    @Column(name = "intro_document_number")
    @Comment("Số giấy giới thiệu chuyển SHĐ")
    String introDocumentNumber;
    @Column(name = "intro_document_date")
    @Comment("Ngày ky giấy giới thiệu")
    Date introDocumentDate;
    @Column(name = "transfer_date")
    @Comment("Ngày chuyển đi")
    Date transferDate;
    @Column(name = "organization_code")
    @Comment("Mã đảng bộ tiếp nhận")
    String organizationCode;
    @Column(name = "organization_name")
    @Comment("Tên đảng bộ tiếp nhận")
    String organizationName;
    @Column(name = "reference_id")
    @Comment("Khoa ngoai toi bang qldv_transfer_within_base")
    String referenceId;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("staffCode", "Mã cán bộ");
                put("fullName", "Họ tên");
                put("decisionNumber", "Số Quyết định chuyển công tác");
                put("issueDate", "Ngày ban hành");
                put("effectiveDate", "Ngày hiệu lực");
                put("reason", "Lý do chuyển sinh hoạt");
                put("issuingOrganization", "Đơn vị ban hành QĐ");
                put("introDocumentNumber", "Số giấy giới thiệu chuyển SHĐ");
                put("introDocumentDate", "Ngày ký giấy giới thiệu");
                put("transferDate", "Ngày chuyển đi");
                put("organizationCode", "Mã đảng bộ tiếp nhận");
                put("organizationName", "Tên đảng bộ tiếp nhận");
            }}
    );
}
