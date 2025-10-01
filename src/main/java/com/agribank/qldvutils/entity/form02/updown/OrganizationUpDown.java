package com.agribank.qldvutils.entity.form02.updown;

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
@Table(name = "qldv_organization_updown")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationUpDown extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    @Comment("1: nang cap, 2: ha cap")
    Integer type;
    @Column(name = "old_name")
    String oldName;
    @Column(name = "old_form")
    String oldForm;
    @Column(name = "new_name")
    String newName;
    @Column(name = "new_form")
    String newForm;
}
