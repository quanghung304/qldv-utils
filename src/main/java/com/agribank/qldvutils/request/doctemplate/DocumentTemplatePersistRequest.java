package com.agribank.qldvutils.request.doctemplate;

import com.agribank.qldvutils.entity.DocumentTemplate;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Gói toàn bộ thao tác ghi của upload/update-mapping template thành 1 lệnh gửi xuống qldv-db, để
 * chạy trong ĐÚNG 1 transaction (coding-convention.md mục 9) — thay vì nhiều lệnh Feign rời rạc
 * (save template, deactivate từng bản cũ), mỗi lệnh tự commit riêng. qldv-db CHỈ persist + tự tra
 * template ACTIVE khác cùng tổ hợp (case_type_id, authority_level, workflow_stage, slot_code,
 * condition_key) để chuyển INACTIVE — không tự thẩm định/validate nghiệp vụ gì thêm (đã chạy xong
 * ở qldv-api TRƯỚC khi gọi xuống đây).
 *
 * {@code deactivateSiblings=true} khi {@code template} vừa được kích hoạt (status=ACTIVE) — PMDV_DOCUMENT_RULE
 * không còn tồn tại nên không còn bước upsert rule riêng như thiết kế trước.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DocumentTemplatePersistRequest {
    DocumentTemplate template;
    boolean deactivateSiblings;
}
