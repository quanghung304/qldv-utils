package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_organization_draft")
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
    @Column(name = "username_created")
    String usernameCreated;
    @Column(name = "user_brcd_created")
    Integer userBrcdCreated;
    @Column(name = "username_accepted")
    String usernameAccepted;
    @Column(name = "user_brcd_accepted")
    Integer userBrcdAccepted;
    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
