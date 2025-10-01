package com.agribank.qldvutils.entity.form02.split;

import com.agribank.qldvutils.entity.base.BaseFormDraftEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Entity
@Table(name = "qldv_org_split_draft")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSplitDraft extends BaseFormDraftEntity {
    @Column(name = "old_code")
    String oldCode;
    @Column(name = "old_name")
    String oldName;
    //Khoa ngoai den bang OrganizationSplit truong hop Sua
    @Column(name = "ref_id")
    String refId;
}