package com.agribank.qldvutils.entity.party_transfer.transfer_within_agribank;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
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
@Entity
@Table(name = "qldv_transfer_within_agribank", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen SHD trong dang bo Agribank
public class TransferWithinAgribank extends BaseEntity<String> {
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
    @Column(name = "expected_expiry_date")
    @Comment("Ngày dự kiến hết hạn chuyển sinh hoạt đảng")
    Date expectedExpiryDate;
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
    @Builder.Default
    Integer deleted = 0;

//    @Column(name = "receive_doc_date")
//    @Comment("Ngày tháng năm nhận hồ sơ")
//    Date receiveDocDate;
//    @Column(name = "doc_status")
//    @Comment("Trạng thái danh mục hồ sơ: 0 thiếu, 1 đầy đủ, 2 cần bổ sung")
//    Integer docStatus;
//    @Column(name = "supplementary_doc_date")
//    @Comment("Ngày Bổ sung hồ sơ")
//    Date supplementaryDocDate;
//    @Column(name = "complete_doc_date")
//    @Comment("Ngày hoàn thiện hồ sơ")
//    Date completeDocDate;
//    @Column(name = "return_doc_status")
//    @Comment("Trả lại hồ sơ: 0 chưa, 1 là đã trả lại hồ sơ")
//    Integer returnDocStatus;
//    @Column(name = "return_doc_date")
//    @Comment("Ngày tháng năm trả lại hồ sơ")
//    Date returnDocDate;
//    @Column(name = "wait_tranfer")
//    @Comment("Chờ chuyển sinh hoạt Đảng")
//    Integer waitTransfer;
//    @Column(name = "wait_tranfer_status")
//    @Comment("Chờ chuyển sinh hoạt đúng sai thời điểm")
//    Integer waitTransferStatus;
//    @Column(name = "tranfer_manager")
//    @Comment("CBTH chuyển trưởng/phó nghiệp vụ")
//    String tranferManager;
//    @Column(name = "approve_transfer_ldb")
//    @Comment("Trưởng/phó nghiệp vụ duyệt và chuyển LĐB")
//    String approveTransferLdb;
}
