package com.agribank.qldvutils.request.report26;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report26SearchRequest extends PagingRequest {
    String staffCode;
    String fullName;
    String vneid;
    String organizationCode;
}
