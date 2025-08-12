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
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_deceased_draft")
@Entity
public class DeceasedDraft extends BaseEntity<String> {
    @Column(name = "date_of_death")
    @Comment("Ngày từ trần")
    Date dateOfDeath;
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
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;
    @Column(name = "ref_id")
    @Comment("id của report_26")
    String refId;
    Integer status;
    Integer deleted;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("effectiveDate", "Ngày hiệu lực");
                    put("reason", "Lý do");
                    put("organizationCode", "Mã chi, đảng bộ");
                    put("staffCode", "Mã nhân viên");
                    put("decisionNumber", "Số giấy chứng tử");
                    put("decisionDate", "Ngày ban hành");
                    put("dateOfDeath", "Ngày từ trần");
                }
            }
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
