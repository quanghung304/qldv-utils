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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_DOCUMENT")
public class Document extends BaseEntity<String> {
    @Column(name = "case_id")
    String caseId;

    @Column(name = "document_type_id")
    String documentTypeId;

    @Column(name = "document_no")
    String documentNo;

    @Column(name = "document_date")
    LocalDate documentDate;

    @Column(name = "effective_date")
    LocalDate effectiveDate;

    @Column(name = "summary")
    String summary;

    @Column(name = "origin")
    Integer origin;

    @Column(name = "created_by")
    String createdBy;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
