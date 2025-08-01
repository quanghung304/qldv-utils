package com.agribank.qldvutils.request.bcsl_report.tcd;

import com.agribank.qldvutils.exception.CommonException;
import com.agribank.qldvutils.request.PagingRequest;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchRequest extends PagingRequest {
    String organizationCode;
    Date date;

    public void validate() {
        if (Objects.isNull(organizationCode) || organizationCode.isBlank()) {
            throw new CommonException("Chưa chọn Tổ chức Đảng");
        }

        if (Objects.isNull(date)) {
            throw new CommonException("Chưa chọn thời điểm báo cáo");
        }
    }
}
