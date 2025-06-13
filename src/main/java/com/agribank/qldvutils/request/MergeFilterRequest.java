package com.agribank.qldvutils.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MergeFilterRequest extends PagingRequest {
    Integer type;
}
