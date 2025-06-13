package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_excel_column_info")
public class ExcelColumnInfo extends BaseEntity<String>{
    String code;
    @Column(name = "column_field")
    String columnField;
    @Column(name = "column_name")
    String columnName;
    @Column(name = "column_title")
    String columnTitle;
    @Column(name = "column_type")
    String columnType;
    @Column(name = "row_order")
    Integer rowOrder;
    @Column(name = "row_span")
    Integer rowSpan;
    @Column(name = "col_span")
    Integer colSpan;
    @Column(name = "sort_order")
    Integer sortOrder;
    int width;
    String height;
    @Column(name = "is_show")
    Integer isShow;
    String align;
    Integer type;
}
