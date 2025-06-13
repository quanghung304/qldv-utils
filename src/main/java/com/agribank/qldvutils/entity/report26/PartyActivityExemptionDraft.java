package com.agribank.qldvutils.entity.report26;

import com.agribank.qldvutils.entity.BaseEntity;
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

import static java.util.Map.entry;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "qldv_party_activity_exemption_draft")
public class PartyActivityExemptionDraft extends BaseEntity<String> {
    @Column(name = "committee_decision")
    @Comment("Cấp ủy quyết định")
    String committeeDecision;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực")
    Date effectiveDate;
    @Column(name = "reason")
    @Comment("Lý do")
    String reason;
    @Column(name = "organization_code")
    String organizationCode;
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "decision_number")
    @Comment("Số quyết định")
    String decisionNumber;
    @Column(name = "decision_date")
    @Comment("Ngày QĐ")
    Date decisionDate;
    @Column(name = "username_created")
    String usernameCreated;
    @Column(name = "username_accepted")
    String usernameAccepted;
    Integer status;
    Integer deleted;
    @Column(name = "ref_id")
    @Comment("id của report_26")
    String refId;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("committeeDecision", "Cấp ủy quyết định");
                    put("effectiveDate", "Ngày hiệu lực");
                    put("reason", "Lý do");
                    put("organizationCode", "Mã chi, đảng bộ");
                    put("staffCode", "Mã nhân viên");
                    put("decisionNumber", "Số quyết định");
                    put("decisionDate", "Ngày quyết định");
                }
            }
    );

}
