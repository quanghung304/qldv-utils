package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
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
@Table(name = "qldv_organization", schema = Constants.DV_DL)
public class Organization extends BaseCodeEntity{
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

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
