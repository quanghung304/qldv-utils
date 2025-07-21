package com.agribank.qldvutils.request.form02;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor()
@NoArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationHistoryRequest {
    List<String> newOrganizationCodes;
    String refId;
    Integer type;
}
