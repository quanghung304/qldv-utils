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
@Table(name = "pmdv_import_file_config")
public class ImportFileConfig extends BaseEntity<String> {
    @Column(name = "code", unique = true, nullable = false)
    String code;
    String name;
    @Column(name = "header_index")
    Integer headerIndex;
    @Column(name = "sub_header_index")
    Integer subHeaderIndex;
}
