package com.agribank.qldvutils.request.bcsl_report.tcd;

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
public class SearchRp01Request extends PagingRequest {
    @NotNull(message = "Chưa chọn hình thức tổ chức Đảng")
    @NotBlank(message = "Chưa chọn hình thức tổ chứa Đảng")
    String form;
    Date fromDate;
    Date toDate;
}
