package com.agribank.qldvutils.entity.form02.split;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Entity
@Table(name = "qldv_org_split_details", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSplitDetail extends BaseEntity<String> {
    @Column(name = "split_id")
    String splitId;
    @Column(name = "new_code")
    String newCode;
    @Column(name = "new_name")
    String newName;
    String form;
}
