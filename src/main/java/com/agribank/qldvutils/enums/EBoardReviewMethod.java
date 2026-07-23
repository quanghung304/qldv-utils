package com.agribank.qldvutils.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum EBoardReviewMethod {
    MEETING(1),
    BALLOT(2);

    Integer id;

    public boolean matches(Integer value) {
        return id.equals(value);
    }

    public static boolean isValid(Integer value) {
        return value != null && Arrays.stream(values()).anyMatch(method -> method.matches(value));
    }
}
