package com.agribank.qldvutils.request.developplan;

import com.agribank.qldvutils.exception.ValidationException;
import com.agribank.qldvutils.request.PagingRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetPlanRequest extends PagingRequest {
    String organizationCode;
    String name;
    Integer startYear;
    Integer endYear;

    @Override
    public void validate() {
        super.validate();
        if (startYear > endYear) {
            throw new ValidationException("start can not bigger than end");
        }
        if (startYear < 1945 || endYear > 2145) {
            throw new ValidationException("Not yet info!");
        }
    }
}
