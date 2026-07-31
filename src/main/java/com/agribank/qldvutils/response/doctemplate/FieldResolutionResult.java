package com.agribank.qldvutils.response.doctemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Kết quả {@code FieldMappingService.resolveAllFields} (qldv-db) trả cho qldv-api qua Feign.
 * {@code mappingComplete=false} khi có ít nhất 1 field trong field_mapping_config có
 * resolution_type/field_path/resolver_id không hợp lệ (tra FieldPathRegistry/Resolver Registry
 * lúc gọi, KHÔNG phải trạng thái đông cứng lưu sẵn) — qldv-api dùng cờ này để quyết định
 * MAPPING_INCOMPLETE, không gọi merge docx.
 *
 * {@code values} chỉ chứa các field ĐÃ tra hợp lệ (kể cả khi resolver trả về null — value null
 * nghĩa là "không có dữ liệu cho hồ sơ này", qldv-api giữ nguyên "[ten_field]" khi merge, KHÔNG
 * coi là lỗi cấu hình).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldResolutionResult {
    boolean mappingComplete;
    Map<String, String> values;
}
