package com.agribank.qldvutils.request.bcsl_report.tcd;

import com.agribank.qldvutils.request.PagingRequest;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchRequest extends PagingRequest {
    String code;
    Date date;
}
