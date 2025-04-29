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
@Table(name = "qldv_organization")
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
    //số quyết định ủy quyền
    @Column(name = "decision_number")
    String decisionNumber;
    //ngày quyết định ủy quyền
    @Column(name = "decision_date")
    Date decisionDate;
    //ngày hiệu lực
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
