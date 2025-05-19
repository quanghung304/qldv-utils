package com.agribank.qldvutils.request.developplan;

import com.agribank.qldvutils.exception.ValidationException;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetChildPlanRequest {
    String prntCode;
    String name;
    Integer startYear;
    Integer endYear;

    public void validate(){
        if (startYear > endYear) {
            throw new ValidationException("start can not bigger than end");
        }
        if (startYear < 1945 || endYear > 2145) {
            throw new ValidationException("Not yet info!");
        }
    }
}
