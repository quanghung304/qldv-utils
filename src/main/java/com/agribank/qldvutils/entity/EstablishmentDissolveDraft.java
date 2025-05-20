package com.agribank.qldvutils.entity;

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
@Table(name = "qldv_establishment_dissolve_draft")
public class EstablishmentDissolveDraft extends BaseFormEntity<String>{
    String code;
    String name;
    String form;
    Integer type;
    Integer status;
    @Column(name = "username_created")
    String usernameCreated;
    @Column(name = "user_brcd_created")
    Integer userBrcdCreated;
    @Column(name = "username_accepted")
    String usernameAccepted;
    @Column(name = "user_brcd_accepted")
    Integer userBrcdAccepted;
}
