package com.agribank.qldvutils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TrangThai {
    ACTIVE("T"),
    INACTIVE("F");

    private final String value;
}
