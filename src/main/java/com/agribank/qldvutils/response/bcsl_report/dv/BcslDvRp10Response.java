package com.agribank.qldvutils.response.bcsl_report.dv;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BcslDvRp10Response {
    String organizationCode;
    String organizationName;
    Integer totalBefore;
    Integer developPlan;
    Integer totalIncrease;
    Integer admissionCount;
    Integer transferToAgribank;
    Integer membershipRestore;
    Integer totalDecrease;
    Integer leaveCount;
    Integer removeCount;
    Integer disciplineCount;
    Integer transferOutAgribank;
    Integer decreasedCount;
    Integer recognizeCount;
    Integer waitRecognize;
    Integer transferWithinAgribank;
    Integer transferTemporary;
    Integer transferProcessing;
    Integer exemptionCount;
    Integer totalAfter;
    Double admissionPercent;

    public void merge(BcslDvRp10Response data) {
        if (this.organizationName == null && data.organizationName != null) {
            this.organizationName = data.organizationName;
        }
        if (this.developPlan == null && data.developPlan != null) {
            this.developPlan = data.developPlan;
        }
        if (this.totalBefore == null && data.totalBefore != null) {
            this.totalBefore = data.totalBefore;
        }
        if (this.totalIncrease == null && data.totalIncrease != null) {
            this.totalIncrease = data.totalIncrease;
        }
        if (this.totalDecrease == null && data.totalDecrease != null) {
            this.totalDecrease = data.totalDecrease;
        }
        if (this.admissionCount == null && data.admissionCount != null) {
            this.admissionCount = data.admissionCount;
        }
        if (this.transferToAgribank == null && data.transferToAgribank != null) {
            this.transferToAgribank = data.transferToAgribank;
        }
        if (this.membershipRestore == null && data.membershipRestore != null) {
            this.membershipRestore = data.membershipRestore;
        }
        if (this.leaveCount == null && data.leaveCount != null) {
            this.leaveCount = data.leaveCount;
        }
        if (this.removeCount == null && data.removeCount != null) {
            this.removeCount = data.removeCount;
        }
        if (this.disciplineCount == null && data.disciplineCount != null) {
            this.disciplineCount = data.disciplineCount;
        }
        if (this.transferOutAgribank == null && data.transferOutAgribank != null) {
            this.transferOutAgribank = data.transferOutAgribank;
        }
        if (this.recognizeCount == null && data.recognizeCount != null) {
            this.recognizeCount = data.recognizeCount;
        }
        if (this.decreasedCount == null && data.decreasedCount != null) {
            this.decreasedCount = data.decreasedCount;
        }
        if (this.waitRecognize == null && data.waitRecognize != null) {
            this.waitRecognize = data.waitRecognize;
        }
        if (this.transferWithinAgribank == null && data.transferWithinAgribank != null) {
            this.transferWithinAgribank = data.transferWithinAgribank;
        }
        if (this.transferTemporary == null && data.transferTemporary != null) {
            this.transferTemporary = data.transferTemporary;
        }
        if (this.exemptionCount == null && data.exemptionCount != null) {
            this.exemptionCount = data.exemptionCount;
        }
        if (this.transferProcessing == null && data.transferProcessing != null) {
            this.transferProcessing = data.transferProcessing;
        }
        if (this.totalAfter == null && data.totalAfter != null) {
            this.totalAfter = data.totalAfter;
        }
        if (this.admissionPercent == null && data.admissionPercent != null) {
            this.admissionPercent = data.admissionPercent;
        }
    }
}
