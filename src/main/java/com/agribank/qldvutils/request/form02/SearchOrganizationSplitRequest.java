package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchOrganizationSplitRequest extends PagingRequest {
    String organizationCode;
    String organizationName;
}
