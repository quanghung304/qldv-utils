package com.agribank.qldvutils.response.attachment;

import com.agribank.qldvutils.entity.Attachment;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Kết quả sau khi qldv-db thay thế xong toàn bộ Attachment của 1 (case_id, workflow_stage) trong 1
 * transaction. {@code deletedFilePaths} là file_path của các dòng CŨ vừa bị xóa khỏi DB — qldv-api
 * dùng danh sách này để xóa object tương ứng trên S3 SAU KHI nhận response (tức SAU KHI transaction
 * DB đã commit thành công), KHÔNG xóa S3 trước.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttachmentReplaceResult {
    List<Attachment> savedAttachments;
    List<String> deletedFilePaths;
}
