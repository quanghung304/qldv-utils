package com.agribank.qldvutils.request.tcd_qlcm;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdQlcmSearchUltilRequest extends PagingRequest {
    String maSoTcd;
    String maSo;
    String maSoCm;
}
