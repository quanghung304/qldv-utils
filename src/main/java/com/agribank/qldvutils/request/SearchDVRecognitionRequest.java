package com.agribank.qldvutils.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchDVRecognitionRequest extends PagingRequest {
    String dvCode;
    String dvName;
    String dvCccd;
    String organizationCode;
}
