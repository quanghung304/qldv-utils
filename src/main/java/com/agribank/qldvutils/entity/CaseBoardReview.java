package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_BOARD_REVIEW")
public class CaseBoardReview extends BaseEntity<String> {
    @Column(name = "case_id", unique = true, nullable = false)
    String caseId;

    @Column(name = "method", nullable = false)
    Integer method;

    @Column(name = "board_document_no")
    String boardDocumentNo;

    @Column(name = "board_document_date")
    LocalDate boardDocumentDate;

    @Column(name = "ballots_issued")
    Integer ballotsIssued;

    @Column(name = "ballots_returned")
    Integer ballotsReturned;

    @Column(name = "ballots_agree")
    Integer ballotsAgree;

    @Column(name = "ballots_disagree")
    Integer ballotsDisagree;

    @Column(name = "opinion_notes")
    String opinionNotes;
}
