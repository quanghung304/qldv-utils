package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum EOperationStatus {
    ACTIVE(1),
    DISSOLVED(2),
    DISBANDED(3);

    int id;

    public static int getValue(String name) {
        for (EOperationStatus e : EOperationStatus.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }
}
