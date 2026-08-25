package com.agribank.qldvutils.request.notification;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

/**
 * Contract dùng chung giữa qldv-api và qldv-db cho API tra cứu thông báo phân trang — cùng
 * pattern {@code CaseSearchQuery}.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationSearchQuery extends PagingRequest {
    /** userId hiện tại — do qldv-api tự set từ SecurityContext, KHÔNG phải field FE gửi lên. */
    String userId;
}
