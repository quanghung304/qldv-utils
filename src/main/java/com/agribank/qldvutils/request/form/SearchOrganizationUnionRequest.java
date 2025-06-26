package com.agribank.qldvutils.request.form;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchOrganizationUnionRequest extends PagingRequest {
    String organizationCode;
}
