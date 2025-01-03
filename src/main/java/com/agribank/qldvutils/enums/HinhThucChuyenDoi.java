package com.agribank.qldvutils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HinhThucChuyenDoi {
    CHUYEN_DOI(1),
    THANH_LAP_MOI(2),
    GIAI_THE(3),
    GIAI_TAN(4);

    private final int id;
}
