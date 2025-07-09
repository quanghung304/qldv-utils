package com.agribank.qldvutils.entity.party_transfer.transfer_within_agribank;

import com.agribank.qldvutils.entity.BaseDraftEntity;
import com.agribank.qldvutils.entity.BaseEntity;
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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "qldv_transfer_within_agribank_draft", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransferWithinAgribankDraft extends BaseDraftEntity {
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "full_name")
    String fullName;
    @Column(name = "process_id")
    @Comment("khoa ngoai toi bang qldv_transfer_process")
    String processId;
    @Column(name = "decision_number")
    @Comment("Số Quyết định chuyển công tác")
    String decisionNumber;
    @Column(name = "expected_expiry_date")
    @Comment("Ngày dự kiến hết hạn chuyển sinh hoạt đảng")
    Date expectedExpiryDate;
    @Column(name = "decision_date")
    @Comment("Ngày ban hành công tác")
    Date decisionDate;
    @Column(name = "decision_issuing_unit")
    @Comment("Đơn vị ban hành quyết định")
    String decisionIssuingUnit;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực")
    Date effectiveDate;
    @Column(name = "date_of_proposal")
    @Comment("Ngày, tháng, năm chi bộ đề nghị CSHĐ")
    Date dateOfProposal;
    @Column(name = "number_of_doc")
    @Comment("Số văn bản")
    String numberOfDoc;
    @Column(name = "committee_proposal_date")
    @Comment("Ngày tháng nam ĐUCS dđề nghị CSHĐ")
    Date committeeProposalDate;
    @Column(name = "number_of_submission")
    @Comment("Số tờ trình")
    String numberOfSubmission;
    @Column(name = "second_intro_number")
    @Comment("Số GGT SHĐ")
    String secondIntroNumber;
    @Column(name = "transfer_date")
    @Comment("Ngày chuyển đến")
    Date transferDate;
    @Column(name = "receiving_org_b_code")
    @Comment("Mã tổ chức đảng cấp B tiếp nhận")
    String receivingOrgBCode;
    @Column(name = "receiving_org_b_name")
    @Comment("Tên tổ chức đảng cấp B tiếp nhận")
    String receivingOrgBName;
    @Column(name = "receiving_org_c_code")
    @Comment("Mã tổ chức đảng cấp C tiếp nhận")
    String receivingOrgCCode;
    @Column(name = "receiving_org_c_name")
    @Comment("Tên tổ chức đảng cấp C tiếp nhận")
    String receivingOrgCName;
    @Column(name = "old_organization_code")
    @Comment("Mã đảng bộ chuyển đi")
    String oldOrganizationCode;
    @Column(name = "ref_id")
    String refId;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("staffCode", "Mã cán bộ");
                put("fullName", "Họ tên");
                put("decisionNumber", "Số Quyết định chuyển công tác");
                put("decisionDate", "Ngày ban hành công tác");
                put("decisionIssuingUnit", "Đơn vị ban hành quyết định");
                put("effectiveDate", "Ngày hiệu lực");
                put("dateOfProposal", "Ngày, tháng, năm chi bộ đề nghị CSHĐ");
                put("numberOfDoc", "Số văn bản");
                put("committeeProposalDate", "Ngày tháng nam ĐUCS dđề nghị CSHĐ");
                put("numberOfSubmission", "Số tờ trình");
                put("secondIntroNumber", "Số GGTSHĐ");
                put("transferDate", "Ngày chuyển đi/ tiếp nhân");
                put("receivingOrgBCode", "Mã tổ chức đảng cấp B tiếp nhận");
                put("receivingOrgBName", "Tên tổ chức đảng cấp B tiếp nhận");
                put("receivingOrgCCode", "Mã tổ chức đảng cấp C tiếp nhận");
                put("receivingOrgCName", "Tên tổ chức đảng cấp C tiếp nhận");
                put("expectedExpiryDate", "Ngày dự kiến hết hạn chuyển sinh hoạt đảng");
            }}
    );
}
