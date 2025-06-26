package com.agribank.qldvutils.dto;

import com.agribank.qldvutils.entity.party_transfer.transfer_temporary.TransferTemporary;
import com.agribank.qldvutils.enums.EDecisionIssuingUnit;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferTemporaryDto {
    String staffCode;
    String fullName;
    String processId;
    String decisionNumber;
    Date issueDate;
    Date effectiveDate;
    EDecisionIssuingUnit decisionIssuingUnit;
    String decisionIssuingUnitOther;
    String issuingOrganizationName;
    String reason;
    Date partyCellRequestDate;
    String partyCellRequestNumber;
    Date partyCommitteeRequestDate;
    String partyCommitteeRequestNumber;
    String transferReferralNumber;
    Date signTransferReferralDate;
    Date startTransferTemporaryDate;
    Date endTransferTemporaryDate;
    Date extendEndTransferTemporaryDate;
    Date receiptDate;
    String receivingOrgCode;
    String receivingOrgName;
    String receivingOutOrgName;
    String organizationCode;

    public TransferTemporaryDto(TransferTemporary transferTemporary, String organizationCode){
        this.staffCode = transferTemporary.getStaffCode();
        this.fullName = transferTemporary.getFullName();
        this.processId = transferTemporary.getProcessId();
        this.decisionNumber = transferTemporary.getDecisionNumber();
        this.issueDate = transferTemporary.getIssueDate();
        this.effectiveDate = transferTemporary.getEffectiveDate();
        this.decisionIssuingUnit = transferTemporary.getDecisionIssuingUnit();
        this.decisionIssuingUnitOther = transferTemporary.getDecisionIssuingUnitOther();
        this.issuingOrganizationName = transferTemporary.getIssuingOrganizationName();
        this.reason = transferTemporary.getReason();
        this.partyCellRequestDate = transferTemporary.getPartyCellRequestDate();
        this.partyCellRequestNumber = transferTemporary.getPartyCellRequestNumber();
        this.partyCommitteeRequestDate = transferTemporary.getPartyCommitteeRequestDate();
        this.partyCommitteeRequestNumber = transferTemporary.getPartyCommitteeRequestNumber();
        this.transferReferralNumber = transferTemporary.getTransferReferralNumber();
        this.signTransferReferralDate = transferTemporary.getSignTransferReferralDate();
        this.startTransferTemporaryDate = transferTemporary.getStartTransferTemporaryDate();
        this.endTransferTemporaryDate = transferTemporary.getEndTransferTemporaryDate();
        this.extendEndTransferTemporaryDate = transferTemporary.getExtendEndTransferTemporaryDate();
        this.receiptDate = transferTemporary.getReceiptDate();
        this.receivingOrgCode = transferTemporary.getReceivingOrgCode();
        this.receivingOrgName = transferTemporary.getReceivingOrgName();
        this.receivingOutOrgName = transferTemporary.getReceivingOutOrgName();
        this.organizationCode = organizationCode;
    }
}
