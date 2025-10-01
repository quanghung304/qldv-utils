package com.agribank.qldvutils.entity.form02.split;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@Builder
@Entity
@Table(name = "qldv_split_detail_draft")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSplitDetailDraft extends BaseEntity<String> {
    //Khoa ngoai toi bang
    @Column(name = "split_id")
    String splitId;
    @Column(name = "new_code")
    String newCode;
    @Column(name = "new_name")
    String newName;
    String form;

    public static Map<String, String> FIELD_MAP = Map.of(
            "newCode", "Mã chi, đảng bộ mới",
            "newName", "Tên chi, đảng bộ mới",
            "form", "Hình thức chi, đảng bộ"
    );
}
