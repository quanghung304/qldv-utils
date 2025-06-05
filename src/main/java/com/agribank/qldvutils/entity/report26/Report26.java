package com.agribank.qldvutils.entity.report26;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_report_26")
public class Report26 extends BaseEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "type")
    @Comment("Kiểu báo cáo")
    Integer type;
    @Column(name = "decision_number")
    @Comment("Số quyết định")
    String decisionNumber;
    @Column(name = "decision_date")
    @Comment("Ngày QĐ")
    Date decisionDate;
    @Column(name = "ref_id")
    @Comment("id refer đến báo cáo liên quan biểu 26")
    String refId;
    @Builder.Default
    Integer deleted = 0;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
