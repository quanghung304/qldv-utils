package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Date;

@Data
@Builder
@Entity
@Table(name = "qldv_transformation_history", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransformationHistory extends BaseFormEntity<String> {
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
