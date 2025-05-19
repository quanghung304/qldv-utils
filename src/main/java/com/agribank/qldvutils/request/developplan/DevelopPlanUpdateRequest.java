package com.agribank.qldvutils.request.developplan;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DevelopPlanUpdateRequest {
    String refId;
    List<Integer> years;
}
