package com.agribank.qldvutils.dto.doctemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 1 dòng trong {@code PMDV_DOCUMENT_TEMPLATE.field_mapping_config} (schema v2, thay schema v1 chỉ
 * có field_path). {@code resolutionType} là 1 trong 3 giá trị: SIMPLE / DERIVED / EXTERNAL_LOOKUP
 * (STATIC_CONFIG/RECIPIENT_CONTEXT/REPEAT_BLOCK CHƯA triển khai).
 *
 * - SIMPLE: chỉ dùng {@code fieldPath} (tra FieldPathRegistry ở qldv-db).
 * - DERIVED / EXTERNAL_LOOKUP: chỉ dùng {@code resolverId} (+ {@code resolverParams} nếu resolver
 *   cần tham số) — tra Resolver Registry ở qldv-db.
 * - {@code resolutionType == null}: placeholder chưa auto-match được lúc upload, CHỜ admin gán
 *   thủ công qua {@code PUT /api/v1/document-templates/{id}/mapping}.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldConfigEntry {
    String placeholder;
    String resolutionType;
    String fieldPath;
    String resolverId;
    Map<String, String> resolverParams;
}
