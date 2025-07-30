package com.agribank.qldvutils.request.bcsl_report.dv;

import com.agribank.qldvutils.request.PagingRequest;
import jakarta.validation.constraints.NotBlank;
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
public class SearchRp10Request extends PagingRequest {
    String organizationCode;
    Date fromDate;
    Date toDate;
}
