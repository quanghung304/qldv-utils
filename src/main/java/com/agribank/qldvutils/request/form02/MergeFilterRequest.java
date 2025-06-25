package com.agribank.qldvutils.request.form02;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MergeFilterRequest extends PagingRequest {
    Integer type;
}
