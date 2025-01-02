package com.agribank.qldvutils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UyQuyen {
    CO("T"),
    KHONG("F");
    
    private final String value;
}
