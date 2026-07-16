package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum EStatusType {
    INTERNAL(1),
    EXTERNAL_WAIT(2),
    FINAL(3);

    int id;

    public static int getValue(String name) {
        for (EStatusType e : EStatusType.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }

    public static String getLabel(Integer id) {
        if (id == null) {
            return null;
        }
        for (EStatusType e : EStatusType.values()) {
            if (e.id == id) {
                return e.name();
            }
        }
        return null;
    }
}
