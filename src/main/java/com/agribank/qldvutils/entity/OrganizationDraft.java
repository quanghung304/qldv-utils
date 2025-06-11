package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Map;

import static java.util.Map.entry;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_organization_draft", schema = Constants.DV_DL)
public class OrganizationDraft extends BaseEntity<String> {
    String code;
    @Column(name = "organization_code")
    String organizationCode;
    String name;
    Integer brcd;
    //hình thức
    String form;
    //Mã tcd cấp trên
    @Column(name = "parent_code")
    String parentCode;
    //được ủy quyền kết nạp, khai trừ
    @Column(name = "authorized")
    Integer authorized;
    //Số kết luận/nghị quyết
    @Column(name = "resolution_number")
    String resolutionNumber;
    //Ngày kết luận/nghị quyết
    @Column(name = "resolution_date")
    Date resolutionDate;
    //Số quyết định thành lập
    @Column(name = "establishment_decision_number")
    String establishmentDecisionNumber;
    //Ngày quyết định
    @Column(name = "decision_date")
    Date decisionDate;
    //Ngày hiệu lực
    @Column(name = "effective_date")
    Date effectiveDate;
    //trạng thái đang hoạt động, giải thể
    String status;
    Integer approve;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;
    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }

    public static Map<String, String> FIELD_MAP = Map.ofEntries(
            entry("code", "Mã chi, đảng bộ"),
            entry("name", "Tên chi, đảng bộ"),
            entry("brcd", "Mã chi nhánh"),
            entry("form", "Hình thức TCD"),
            entry("parentCode", "Mã chi nhánh cha"),
            entry("authorized", "Được ủy quyền"),
            entry("resolutionNumber", "Số KL/NQQ"),
            entry("resolutionDate", "Ngày kết luận/nghị quyết"),
            entry("establishmentDecisionNumber", "Số quyết định thành lập"),
            entry("decisionDate", "Ngày quyết định"),
            entry("effectiveDate", "Ngày hiệu lực"),
            entry("status", "trạng thái đang hoạt động, giải thể")
    );
}
