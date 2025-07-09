package com.agribank.qldvutils.entity.party_transfer.transfer_within_base;

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
@Table(name = "qldv_transfer_within_base", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen SHD trong dang bo co so
public class TransferWithinBase extends BaseEntity<String> {
    @Column(name = "staff_code")
    String staffCode;
    String fullName;
    @Column(name = "process_id")
    @Comment("khoa ngoai toi bang qldv_transfer_process")
    String processId;
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

}
