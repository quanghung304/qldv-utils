package com.agribank.qldvutils.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DVSearchResponse {
    String id;
    String staffCode;
    String fullname;
    String organizationCode;
    String organizationName;
    String organizationBName;
    String partyCardNumber;
    String birthday;
    String admissionDate;
    String status;
}
