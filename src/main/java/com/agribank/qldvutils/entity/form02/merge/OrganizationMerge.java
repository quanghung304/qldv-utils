package com.agribank.qldvutils.entity.form02.merge;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Data
@Builder
@Entity
@Table(name = "qldv_organization_merge")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationMerge extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    @Comment("ma chi dang bo nhan sap nhap/sau hop nhat")
    String organizationCode;
    @Column(name = "organization_name")
    @Comment("ten chi dang bo nhan sap nhap/sau hop nhat")
    String organizationName;
    @Comment("hinh thuc chi dang bo sau hop nhat")
    String form;
    @Comment("4: sap nhap, 5: hop nhat")
    Integer type;
}
