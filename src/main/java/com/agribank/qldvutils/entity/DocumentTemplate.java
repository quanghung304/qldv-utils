package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

/**
 * Mẫu văn bản .docx cho 1 "slot" cụ thể của quy trình — thay thế hoàn toàn PMDV_DOCUMENT_TYPE +
 * PMDV_DOCUMENT_RULE (2 bảng đó KHÔNG còn giá trị nghiệp vụ độc lập: "chọn loại văn bản từ danh
 * mục" không cần thiết, actor chỉ cần biết "file này dùng cho hồ sơ loại gì, bước nào"). Mọi thông
 * tin quyết định "văn bản nào cần sinh ở bước nào" nay nằm thẳng trên entity này, đọc động tại
 * runtime — KHÔNG hardcode danh sách slot theo case_type/bước ở bất kỳ đâu trong code.
 *
 * {@code @UniqueConstraint} bên dưới CHỈ khai báo mức ràng buộc DB thô — KHÔNG đủ diễn tả đúng
 * quy tắc nghiệp vụ thật ("chỉ 1 bản ACTIVE cho mỗi tổ hợp tại 1 thời điểm", vì DB không phân biệt
 * theo status). Ràng buộc thật BẮT BUỘC kiểm tra ở tầng Service khi kích hoạt (chuyển
 * status=ACTIVE): tự động chuyển các bản ACTIVE khác cùng tổ hợp về INACTIVE — xem
 * {@code com.agribank.qldvdb.service.DocumentTemplatePersistService}.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_DOCUMENT_TEMPLATE")
public class DocumentTemplate extends BaseEntity<String> {
    @Column(name = "case_type_id", nullable = false)
    @Comment("FK PMDV_CASE_TYPE.id — loại nghiệp vụ hồ sơ mà template này phục vụ")
    String caseTypeId;

    @Column(name = "authority_level", nullable = false)
    @Comment("1=BANK_LEVEL, 2=GRASSROOTS_LEVEL")
    Integer authorityLevel;

    @Column(name = "workflow_stage", nullable = false)
    @Comment("Lưu status_code dạng chuỗi (VD 'A-01')")
    String workflowStage;

    @Column(name = "template_code", nullable = false)
    @Comment("Định danh TỰ DO do người upload đặt tên (VD 'TO_TRINH_BTV', 'PHIEU_BTV')")
    String templateCode;

    @Column(name = "condition_key")
    @Comment("NULLABLE — điều kiện rẽ nhánh khi 1 slot_code có nhiều template cùng bước (VD "
            + "'MEETING'/'BALLOT' theo PMDV_CASE.btv_method). NULL = áp dụng cho mọi trường hợp")
    String conditionKey;

    @Column(name = "template_name", nullable = false)
    @Comment("Tên hiển thị tự do (VD 'Tờ trình Ban Thường vụ (có họp)'), nhập tay lúc upload")
    String templateName;

    @Column(name = "storage_path", nullable = false)
    @Comment("S3 object key của file template")
    String storagePath;

    @Column(name = "status", nullable = false)
    @Comment("DRAFT / PENDING_REVIEW / ACTIVE / INACTIVE")
    String status;

    @Lob
    @Column(name = "field_mapping_config", nullable = false)
    @Comment("JSON schema v2: {fields: [{placeholder, resolution_type, field_path|resolver_id+resolver_params}], repeat_blocks: []}")
    String fieldMappingConfig;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
