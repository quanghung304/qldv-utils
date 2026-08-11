package com.agribank.qldvutils.enums;

public class Constants {
    public static final String DANG_UY_AGRIBANK_CODE = "1000";
    public static final String BTCDU_CODE = "1001";

    /** PMDV_CASE_HISTORY.entity_table cho hồ sơ module Tổ chức Đảng (PMDV_CASE). */
    public static final String ENTITY_TABLE_CASE = "PMDV_CASE";

    /**
     * PMDV_DOCUMENT_TEMPLATE.status = "ACTIVE" — dùng chung giữa qldv-api
     * (DocumentTemplateService) và qldv-db (DocumentTemplateController), 2 module không phụ
     * thuộc lẫn nhau nên hằng số dùng chung phải đặt ở qldv-utils.
     */
    public static final String STATUS_ACTIVE = "ACTIVE";
}
