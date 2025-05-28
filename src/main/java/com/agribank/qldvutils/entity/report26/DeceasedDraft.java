package com.agribank.qldvutils.entity.report26;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;
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
    @Column(name = "username_created")
    String usernameCreated;
    @Column(name = "username_accepted")
    String usernameAccepted;
    @Column(name = "ref_id")
    @Comment("id của report_26")
    String refId;
    Integer status;
    Integer deleted;

    public static Map<String, String> FIELD_MAP = Map.ofEntries(
            entry("effectiveDate", "Ngày hiệu lực"),
            entry("reason", "Lý do"),
            entry("organizationCode", "Mã chi, đảng bộ"),
            entry("staffCode", "Mã nhân viên"),
            entry("decisionNumber", "Số giấy chứng tử"),
            entry("decisionDate", "Ngày ban hành"),
            entry("dateOfDeath", "Ngày từ trần")
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
