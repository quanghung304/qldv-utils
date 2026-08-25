package com.agribank.qldvutils.request.notification;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Gói 1 PMDV_NOTIFICATION + N PMDV_NOTIFICATION_RECIPIENT thành 1 lệnh gửi xuống qldv-db, chạy
 * trong ĐÚNG 1 transaction ({@code NotificationPersistService}, qldv-db) — cùng pattern atomic
 * multi-entity persist đã dùng cho {@code CaseChangePersistRequest}. {@code refId} = id của đối
 * tượng nghiệp vụ mà thông báo nói về (hiện tại luôn là {@code Case.id}).
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationPersistRequest {
    String refId;
    String title;
    String content;
    String type;
    /** Màn hình FE cần điều hướng tới khi bấm vào thông báo — lấy từ {@code CaseType.code} của case liên quan (xem CaseService#notifyAfterWorkflowAction). */
    String screen;
    List<String> recipientUserIds;
}
