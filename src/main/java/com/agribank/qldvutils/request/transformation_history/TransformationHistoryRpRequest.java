package com.agribank.qldvutils.request.transformation_history;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransformationHistoryRpRequest {
    List<String> codes;
    Date fromDate;
    Date toDate;
}
