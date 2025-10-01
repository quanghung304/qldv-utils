package com.agribank.qldvutils.entity.form02.rename;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Entity
@Table(name = "qldv_organization_rename")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationRename extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;

    @Column(name = "organization_name")
    String organizationName;

    @Column(name = "old_organization_name")
    String oldOrganizationName;

}
