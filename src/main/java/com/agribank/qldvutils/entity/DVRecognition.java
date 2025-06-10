package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_recognition", schema = Constants.DV_DL)
public class DVRecognition extends BaseEntity<String>{
    //Ma can bo
    @Column(name = "staff_code")
    String staffCode;
    //So KL/Nghi Quyet
    @Column(name = "conclusion_number")
    String conclusionNumber;
    //Số QD
    @Column(name = "decision_number")
    String decisionNumber;
    //Ngay KL/Nghi quyet
    @Column(name = "conclusion_date")
    Date conclusionDate;
    //Ngay QD
    @Column(name = "decision_date")
    Date decisionDate;
    @Builder.Default
    Integer deleted = 0;
}
