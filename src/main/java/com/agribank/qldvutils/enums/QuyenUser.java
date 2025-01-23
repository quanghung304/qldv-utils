package com.agribank.qldvutils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuyenUser {
    GIAO_DICH(1),
    PHE_DUYET(2),
    VAN_THU(3),
    ADMIN(9);

    private final int id;
}
