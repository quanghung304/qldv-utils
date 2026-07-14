package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum EDocumentOrigin {
    REFERENCE(1),
    GENERATED(2);

    int id;

    public static int getValue(String name) {
        for (EDocumentOrigin e : EDocumentOrigin.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }
}
