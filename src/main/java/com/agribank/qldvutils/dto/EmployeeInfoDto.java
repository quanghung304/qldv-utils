package com.agribank.qldvutils.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeInfoDto {
    String empno;
    String employeeName;
    String empUsualName;
    String gender;
    String birthdt;
    String birthProvCode;
    String birthProvName;
    String birthAddress;
    String nativeProvCode;
    String nativeProvName;
    String nativeAddress;
    String permanentResidenceProv;
    String permanentResidenceProvName;
    String permanentResidenceAddress;
    String tempResidenceProv;
    String tempResidenceProvName;
    String tempResidenceAddress;
    String raceCode;
    String raceName;
    String religionCode;
    String religionName;
    String email;
    String brcd;
}
