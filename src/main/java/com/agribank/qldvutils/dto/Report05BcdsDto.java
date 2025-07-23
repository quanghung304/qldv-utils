package com.agribank.qldvutils.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report05BcdsDto {
    String code;
    String oldName;
    String oldForm;
    String newName;
    String newForm;
    String type;
    String conclusionNumber;
    Date conclusionDate;
    String decisionNumber;
    Date effectiveDate;
}
