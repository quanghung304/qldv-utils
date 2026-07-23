package com.agribank.qldvutils.enums;

/**
 * 4 action dùng chung của POST /cases/{id}/workflow-action (xem workflow-states.md). Không bao
 * gồm các action đặc biệt (UPLOAD_BTV_RESULT, APPROVE_ISSUE...) — những action đó chỉ xuất hiện
 * trong cấu hình 34 transition (CaseWorkflowConfig), do endpoint nghiệp vụ riêng gọi thẳng
 * WorkflowEngine, không đi qua endpoint public này.
 */
public enum ECaseWorkflowAction {
    SUBMIT_CONTROL,
    RETURN,
    APPROVE_FORWARD,
    APPROVE,
    REGISTER_SIGNED_DOC,
    APPROVE_COMPLETE,
    APPROVE_ISSUE,
    SUBMIT_TO_PARENT,
    RECEIVE_ROUTE
}
