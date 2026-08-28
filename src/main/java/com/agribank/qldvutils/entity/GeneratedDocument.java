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
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_GENERATED_DOCUMENT")
public class GeneratedDocument extends BaseEntity<String> {
    @Column(name = "case_id")
    String caseId;

    @Column(name = "template_id")
    @Comment("FK PMDV_DOCUMENT_TEMPLATE.id — NULL khi văn bản này là REFERENCE nhập tay")
    String templateId;

    @Column(name = "template_code")
    @Comment("Denormalize từ PMDV_DOCUMENT_TEMPLATE.template_code lúc sinh")
    String templateCode;

    @Column(name = "document_name")
    @Comment("Tên văn bản tự do do chuyên viên tự gõ — BẮT BUỘC khi templateId NULL")
    String documentName;

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
