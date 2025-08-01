package com.agribank.qldvutils.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeInfoDto {
    String staffCode;
    String fullName;
    String usingName;
    String gender;
    String birthday;
    String birthPlace;
    String hometown;
    String permanentResidence;
    String temporaryResidence;
    String raceCode;
    String ethnic;
    String religionCode;
    String religion;
    String email;
    String brcd;
    String vneid;
    Date admissionDate;
    String agbkdt;
}
