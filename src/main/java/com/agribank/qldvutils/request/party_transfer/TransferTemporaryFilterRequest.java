package com.agribank.qldvutils.request.party_transfer;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransferTemporaryFilterRequest extends PagingRequest {
    String fullName;
    String organizationCode;
}
