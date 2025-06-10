package com.agribank.qldvutils.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DVRecognitionDto {
    String id;
    String dvCode;
    String dvName;
    //So KL/Nghi Quyet
    String conclusionNumber;
    //Số QD
    String decisionNumber;
    //Ngay KL/Nghi Quyet
    Date conclusionDate;
    //Ngay QD
    Date decisionDate;
}
