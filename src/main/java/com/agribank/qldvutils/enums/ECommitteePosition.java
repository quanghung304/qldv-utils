package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ECommitteePosition {
    SECRETARY(1),
    DEPUTY_SECRETARY(2),
    MEMBER(3);

    int id;

    public static int getValue(String name) {
        for (ECommitteePosition e : ECommitteePosition.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }
}
