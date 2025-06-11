package com.agribank.qldvutils.entity.party_reinstatement;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Date;
import java.util.Map;

import static java.util.Map.entry;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_party_reinstatement_draft", schema = Constants.DV_DL)
public class PartyReinstatementDraft extends BaseEntity<String> {
    @Column(name = "organization_code")
    @Comment("Mã Tổ chức Đảng")
    String organizationCode;
    @Column(name = "staff_code")
    @Comment("Mã Nhân viên")
    String staffCode;
    @Column(name = "conclusion_number")
    @Comment("so ket luan/nghi quyet")
    String conclusionNumber;
    @Column(name = "conclusion_date") //ngay ket luan/nghi quyet
    @Comment("ngay ket luan/nghi quyet")
    Date conclusionDate;
    @Column(name = "decision_number")
    @Comment("so quyet dinh")
    String decisionNumber;
    @Column(name = "decision_date")
    @Comment("ngay quyet dinh")
    Date decisionDate;
    @Column(name = "ref_id")
    String refId;
    Integer status;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;

    public static Map<String, String> FIELD_MAP = Map.ofEntries(
            entry("organizationCode", "Cấp ủy khôi phục đảng tịch"),
            entry("staffCode", "Mã nhân viên"),
            entry("conclusionNumber", "Số KL/NQ"),
            entry("conclusionDate", "Ngày KL/NQ"),
            entry("decisionNumber", "Số quyết định"),
            entry("decisionDate", "Ngày quyết định")
    );
}
