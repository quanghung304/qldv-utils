package com.agribank.qldvutils.request.report_tcd;

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
public class SearchRp09Request extends PagingRequest {
    String organizationCode;
    @NotNull(message = "Chưa chọn thời điểm báo cáo")
    Date fromDate;
    @NotNull(message = "Chưa chọn thời điểm báo cáo")
    Date toDate;
}
