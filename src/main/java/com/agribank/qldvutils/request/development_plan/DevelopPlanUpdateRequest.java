package com.agribank.qldvutils.request.development_plan;

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
