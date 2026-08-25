package com.agribank.qldvutils.enums;

/**
 * type của PMDV_NOTIFICATION (String, dùng .name() làm code) — hiện chỉ phát sinh từ
 * POST /cases/{id}/workflow-action ({@code CaseService.performWorkflowAction}, qldv-api).
 */
public enum ENotificationType {
    /** Hồ sơ tiến sang bước mới (SUBMIT_CONTROL/APPROVE_FORWARD/APPROVE) — gửi cho người xử lý bước kế tiếp. */
    TASK_ASSIGNED,
    /** Hồ sơ bị trả lại (RETURN) — gửi cho người đã submit ở bước trước. */
    CASE_RETURNED
}
