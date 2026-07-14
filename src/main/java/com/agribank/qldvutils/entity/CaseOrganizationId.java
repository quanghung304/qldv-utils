package com.agribank.qldvutils.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseOrganizationId implements Serializable {
    private String caseId;
    private String organizationId;
}
