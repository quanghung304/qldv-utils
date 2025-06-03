package com.agribank.qldvutils.request.development_plan;

import com.agribank.qldvutils.exception.ValidationException;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DevelopPrntBrcdRequest {
    String prntCode;
    Integer start;
    Integer end;

    public void validate(){
        if (start > end) {
            throw new ValidationException("start can not bigger than end");
        }
        if (start < 1945 || end > 2145) {
            throw new ValidationException("Not yet info!");
        }
    }
}
