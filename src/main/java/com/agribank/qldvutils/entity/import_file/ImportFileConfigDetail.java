package com.agribank.qldvutils.entity.import_file;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "pmdv_import_file_config_detail")
public class ImportFileConfigDetail extends BaseEntity<String> {
    @Column(name = "ref_id")
    String refId;
    String name;
    String field;
    String mapping;
    @Column(name = "data_type")
    String dataType;
    Integer required;
    String regex;
    @Column(name = "condition")
    String validate;
}
