package com.agribank.qldvutils.request.membershipProposal;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MPSearchRequest extends PagingRequest {
    String staffCode;
    String fullName;
    String vneid;
    String organizationCode;

    @Override
    public void validate() {
        super.validate();
    }
}
