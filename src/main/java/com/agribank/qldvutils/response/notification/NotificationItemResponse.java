package com.agribank.qldvutils.response.notification;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

/**
 * 1 dòng PMDV_NOTIFICATION_RECIPIENT join PMDV_NOTIFICATION, đã "trải phẳng" cho FE — {@code id}
 * là id của NotificationRecipient (dùng để gọi API đánh dấu đã xem), {@code refId} là id của đối
 * tượng nghiệp vụ thông báo nói về (hiện tại luôn là Case.id).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationItemResponse {
    String id;
    String refId;
    String title;
    String content;
    String type;
    String screen;
    Integer isSeen;
    Timestamp createdAt;
}
