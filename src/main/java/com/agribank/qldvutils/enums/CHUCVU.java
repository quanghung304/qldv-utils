package com.agribank.qldvutils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CHUCVU {
    GIAO_DICH(0),
    TRUONG_PHO_PHONG(1),
    LANH_DAO(2);

    private final int id;
}
