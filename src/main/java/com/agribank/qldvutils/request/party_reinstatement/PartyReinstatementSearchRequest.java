package com.agribank.qldvutils.request.party_reinstatement;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyReinstatementSearchRequest extends PagingRequest {
    String staffCode;
    String fullName;
    String vneid;
    String organizationCode;

    @Override
    public void validate() {
        super.validate();
    }
}
