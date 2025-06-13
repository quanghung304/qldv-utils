package com.agribank.qldvutils.entity.form02.merge;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Map;

@Data
@Builder
@Entity
@Table(name = "qldv_org_merge_details", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationMergeDetail extends BaseEntity<String> {
    @Column(name = "reference_id")
    @Comment("khoa ngoai toi bang qldv_organization_merge")
    String referenceId;
    @Column(name = "old_code")
    @Comment("ma chi dang bo bi sap nhap/hop nhat")
    String oldCode;
    @Column(name = "old_name")
    @Comment("ten chi dang bo bi sap nhap/hop nhat")
    String oldName;
}
