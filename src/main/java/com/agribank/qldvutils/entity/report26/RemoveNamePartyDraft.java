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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_remove_name_party_draft")
public class RemoveNamePartyDraft extends BaseEntity<String> {
    @Column(name = "committee_decision")
    @Comment("Cấp ủy quyết định")
    String committeeDecision;
    @Column(name = "resolution_number")
    @Comment("Số kết luận/nghị quyết")
    String resolutionNumber;
    @Column(name = "resolution_date")
    @Comment("Ngày kết luận/nghị quyết")
    Date resolutionDate;
    @Column(name = "reason")
    @Comment("Lý do ra khỏi Đảng")
    String reason;
    @Column(name = "effective_date")
    @Comment("Ngày hiệu lực")
    Date effectiveDate;
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
    @Column(name = "ref_id")
    @Comment("id của report_26")
    String refId;
    Integer status;
    Integer deleted;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("staffCode", "Mã nhân viên");
                    put("organizationCode", "Mã chi, đảng bộ");
                    put("reason", "Lý do");
                    put("committeeDecision", "Cấp ủy quyết định");
                    put("decisionNumber", "Số quyết định");
                    put("decisionDate", "Ngày quyết định");
                    put("resolutionNumber", "Số kết luận/nghị quyết");
                    put("resolutionDate", "Ngày kết luận/nghị quyết");
                    put("effectiveDate", "Ngày hiệu lực");
                }}
    );

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
