package com.agribank.qldvutils.request.dv;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchDVRequest extends PagingRequest {
    Integer brcd;
    String name;
    String organizationCode;
    String parentCode;
    String vneid;
    String code;
}
