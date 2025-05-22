package com.agribank.qldvutils.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchDVRequest extends PagingRequest {
    String staffCode;
    String name;
    String vneid;
    String organizationCode;
    String form;
}
