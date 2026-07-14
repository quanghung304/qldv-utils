package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ECommitteeMemberStatus {
    PROPOSED(1),
    OFFICIAL(2),
    DISMISSED(3);

    int id;

    public static int getValue(String name) {
        for (ECommitteeMemberStatus e : ECommitteeMemberStatus.values()) {
            if (e.name().equals(name)) {
                return e.id;
            }
        }
        return -1;
    }
}
