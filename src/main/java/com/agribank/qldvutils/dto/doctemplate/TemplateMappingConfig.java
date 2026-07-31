package com.agribank.qldvutils.dto.doctemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Cấu trúc JSON lưu trong {@code PMDV_DOCUMENT_TEMPLATE.field_mapping_config} — schema v2:
 * {@code fields} thay cho {@code placeholders} (v1, chỉ có field_path đơn giản), thêm
 * {@code repeatBlocks} (CHƯA xử lý — luôn để rỗng, Pha 2 riêng). Dùng chung giữa qldv-api (ghi lúc
 * upload/update-mapping) và qldv-db (đọc lúc sinh văn bản, S2-03).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateMappingConfig {
    List<FieldConfigEntry> fields = new ArrayList<>();
    List<Object> repeatBlocks = new ArrayList<>();
}
