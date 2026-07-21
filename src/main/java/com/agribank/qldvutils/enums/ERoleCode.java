package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * 8 vai trò tham gia hệ thống (PMDV_ROLE.role_code) — đồng bộ permission-rules.md /
 * workflow-states.md. R-DVTT đã loại khỏi phạm vi dự án, không có trong enum này.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ERoleCode {
    R_ADM("R-ADM"),
    R_CV("R-CV"),
    R_KS("R-KS"),
    R_LD("R-LD"),
    R_QTVCS("R-QTVCS"),
    R_BPTM("R-BPTM"),
    R_PDCS("R-PDCS"),
    R_KSCS("R-KSCS");

    String code;
}
