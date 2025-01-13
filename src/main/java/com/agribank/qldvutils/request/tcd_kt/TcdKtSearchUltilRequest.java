package com.agribank.qldvutils.request.tcd_kt;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TcdKtSearchUltilRequest extends PagingRequest {
    String maSoTcd;
    String maSo;
}
