package com.agribank.qldvutils.entity.party_transfer.transfer_to;

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
@Table(name = "qldv_transfer_to_agribank", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//chuyen sinh hoat dang den dang bo Agribank
public class TransferToAgribank extends BaseEntity<String> {
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "full_name")
    String fullName;
    @Column(name = "process_id")
    @Comment("khoa ngoai toi bang qldv_transfer_process")
    String processId;
    @Column(name = "decision_number")
    @Comment("Số Quyết định tuyển dụng/tiếp nhận")
    String decisionNumber;
    @Column(name = "issue_date")
    @Comment("Ngày ban hành QĐ")
    Date issueDate;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực QĐ")
    Date effectiveDate;
    @Column(name = "issuing_organization")
    @Comment("Đơn vị ban hành QĐ: BTV Đảng ủy Agribank/ HĐTV/ Chủ tịch HĐTV/ TGĐ")
    String issuingOrganization;
    @Column(name = "expected_expiry_date")
    @Comment("Ngày dự kiến hết hạn chuyển sinh hoạt đảng")
    Date expectedExpiryDate;
    @Column(name = "first_intro_number")
    @Comment("Số giấy giới thiệu chuyển SHĐ đến")
    String firstIntroNumber;
    @Column(name = "first_intro_date")
    @Comment("Ngày, tháng, năm ký GGT")
    Date firstIntroDate;
    @Column(name = "transferring_party_name")
    @Comment("Tên Đảng Ủy chuyển")
    String transferringPartyName;
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
}
