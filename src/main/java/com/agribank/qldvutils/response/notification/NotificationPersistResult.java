package com.agribank.qldvutils.response.notification;

import com.agribank.qldvutils.entity.Notification;
import com.agribank.qldvutils.entity.NotificationRecipient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Kết quả persist trả về CẢ NotificationRecipient (đã có id) — qldv-api cần recipientId thật (id
 * dùng để đánh dấu đã xem) để build payload đẩy qua WebSocket ngay sau khi tạo, không phải chỉ
 * trả Notification như trước (thiếu id riêng của từng người nhận).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationPersistResult {
    Notification notification;
    List<NotificationRecipient> recipients;
}
