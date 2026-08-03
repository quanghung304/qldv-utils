package com.agribank.qldvutils.request.attachment;

import com.agribank.qldvutils.entity.Attachment;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Gói toàn bộ thao tác "thay thế" tài liệu đính kèm của 1 (case_id, workflow_stage) thành 1 lệnh
 * gửi xuống qldv-db, chạy trong ĐÚNG 1 transaction (coding-convention.md mục 9) — xóa toàn bộ dòng
 * cũ + insert dòng mới, KHÔNG gọi rời rạc nhiều lệnh save/delete từ qldv-api.
 *
 * {@code newAttachments} PHẢI đã có {@code filePath} (file đã upload lên S3 THÀNH CÔNG trước khi
 * gọi request này — xem AttachmentService.uploadAttachments) — service này CHỈ persist, không tự
 * upload/tải file.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttachmentReplaceRequest {
    String caseId;
    String workflowStage;
    List<Attachment> newAttachments;
}
