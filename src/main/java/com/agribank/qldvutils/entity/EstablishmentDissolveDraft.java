package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_establishment_dissolve_draft")
public class EstablishmentDissolveDraft extends BaseFormEntity<String>{
    String code;
    String name;
    String form;
    @Comment("0: thanh lap, 6: giai the")
    Integer type;

    @Comment("0: pending, 1: da duyet, 2: huy bo")
    Integer status;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;

    public static Map<String, String> FIELD_MAP = Map.of(
            "code", "Mã chi, đảng bộ",
            "name", "Tên chi, đảng bộ",
            "form", "Hình thức chi, đảng bộ"
    );
}
