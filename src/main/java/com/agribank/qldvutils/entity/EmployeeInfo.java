package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "tbga_hrempinfo", schema = Constants.MIS_DL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeInfo {
    @Id
    String empno;
    @Column(name = "empnm")
    String employeeName;
    @Column(name = "empunm")
    String empUsualName;
    String gender;
    String birthdt;
    @Column(name = "bpprov")
    String birthProvCode;
    @Column(name = "bpaddr")
    String birthAddress;
    @Column(name = "npprov")
    String nativeProvCode;
    @Column(name = "npaddr")
    String nativeAdress;
    @Column(name = "prprov")
    String permanentResidenceProv;
    @Column(name = "pvaddr")
    String permanentResidenceAddress;
    @Column(name = "trprov")
    String tempResidenceProv;
    @Column(name = "traddr")
    String tempResidenceAddress;
    @Column(name = "race")
    String raceCode;
    @Column(name = "relign")
    String religionCode;
    @Column(name = "email")
    String email;
    @Column(name = "IDNO")
    String idNo;
    @Column(name = "AGBKDT")
    String agbkdt;
}
