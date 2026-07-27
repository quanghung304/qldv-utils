package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

/**
 * Ghi nhận ý kiến Ban Chấp hành (BCH) Đảng bộ Agribank — Bước 3 giai đoạn 1 (API-SC05-01).
 * Mirror nguyên cấu trúc {@link CaseBoardReview} (S3-01/API-SC04-01, chỉ khác đổi prefix
 * board_ → committee_) theo đúng chỉ định của prompt_S3-02 mục 3 ("cấu trúc giống hệt
 * API-SC04-01") và GC-S3-02-01 (tái sử dụng pattern lưu trữ đã chọn ở S3-01, không tạo pattern
 * khác). Dùng chung enum {@link com.agribank.qldvutils.enums.EBoardReviewMethod} (MEETING/BALLOT)
 * — không tạo enum trùng lặp chỉ vì đổi bối cảnh BTV → BCH.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_COMMITTEE_REVIEW")
public class CaseCommitteeReview extends BaseEntity<String> {
    @Column(name = "case_id", unique = true, nullable = false)
    String caseId;

    @Column(name = "method", nullable = false)
    Integer method;

    @Column(name = "committee_document_no")
    String committeeDocumentNo;

    @Column(name = "committee_document_date")
    LocalDate committeeDocumentDate;

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
