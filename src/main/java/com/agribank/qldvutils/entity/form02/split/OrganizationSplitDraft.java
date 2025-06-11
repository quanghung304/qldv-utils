package com.agribank.qldvutils.entity.form02.split;

import com.agribank.qldvutils.entity.BaseDraftEntity;
import com.agribank.qldvutils.entity.base.BaseFormDraftEntity;
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
@Table(name = "qldv_org_split_draft", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSplitDraft extends BaseFormDraftEntity {
    @Column(name = "old_code")
    String oldCode;
    @Column(name = "old_name")
    String oldName;
}