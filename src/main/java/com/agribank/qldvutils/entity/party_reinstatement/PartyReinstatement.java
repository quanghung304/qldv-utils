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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_party_reinstatement", schema = Constants.DV_DL)
public class PartyReinstatement extends BaseEntity<String> {
    @Column(name = "organization_code")
    @Comment("Mã Tổ chức Đảng")
    String organizationCode;
    @Column(name = "staff_code")
    @Comment("Mã Nhân viên")
    String staffCode;
    @Column(name = "desicion_committee")
    @Comment("Cấp ủy khôi phục đảng tịch")
    String decisionCommittee;
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
    Integer deleted;
}
