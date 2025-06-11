package com.agribank.qldvutils.entity.import_file;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
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
@Table(name = "qldv_import_file_config", schema = Constants.DV_DL)
public class ImportFileConfig extends BaseEntity<String> {
    @Column(name = "code", unique = true, nullable = false)
    String code;
    String name;
    @Column(name = "header_index")
    Integer headerIndex;
    @Column(name = "sub_header_index")
    Integer subHeaderIndex;
}
