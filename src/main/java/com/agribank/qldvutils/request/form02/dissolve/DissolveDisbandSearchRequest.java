package com.agribank.qldvutils.request.form02.dissolve;

import com.agribank.qldvutils.request.PagingRequest;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DissolveDisbandSearchRequest extends PagingRequest {
    @NotNull
    Integer type;
    String code;
    String name;
}
