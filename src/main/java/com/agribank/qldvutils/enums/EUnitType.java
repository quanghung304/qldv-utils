package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum EUnitType {
    TRUNG_TAM_QUAN_LY_DU_LIEU(1),
    BAN_TO_CHUC_DANG_UY(2),
    DANG_BO_CO_SO(3),
    CHI_BO_CO_SO(4),
    CHI_BO_TRUC_THUOC_TRU_SO_CHINH(5),
    CHI_BO_TRUC_THUOC_DANG_BO_CO_SO(6),
    DON_VI_TRUC_THUOC(7);

    int id;

    public static int getValue(String name) {
        for (EUnitType e : EUnitType.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }
}
