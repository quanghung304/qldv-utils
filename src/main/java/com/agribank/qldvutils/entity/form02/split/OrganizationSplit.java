package com.agribank.qldvutils.entity.form02.split;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@Builder
@Entity
@Table(name = "qldv_organization_split")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSplit extends BaseFormEntity<String> {
    @Column(name = "old_code")
    String oldCode;
    @Column(name = "old_name")
    String oldName;

    public static Map<String, String> FIELD_MAP = Map.of(
            "oldCode", "Mã chi, đảng bộ cũ",
            "oldName", "Tên chi, đảng bộ cũ"
    );
}
