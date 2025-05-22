package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "tbga_hrjoin", schema = Constants.MIS_DL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmpPoliticalInfo {
    @Id
    String empno;
    @Column(name = "ptydt")
    String partJoinDate;
    @Column(name = "ptyofdt")
    String officalJointDate;
    @Column(name = "ptycardno")
    String ptyCardNo;
    @Column(name = "ptyjoinpl")
    String joinPlace;
    @Column(name = "ptyintrer")
    String introducer;
}
