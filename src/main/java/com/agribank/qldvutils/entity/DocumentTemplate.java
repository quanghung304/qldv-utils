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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_DOCUMENT_TEMPLATE")
public class DocumentTemplate extends BaseEntity<String> {
    @Column(name = "document_type_id")
    String documentTypeId;

    @Column(name = "template_file_name")
    String templateFileName;

    @Column(name = "storage_path")
    String storagePath;

    @Column(name = "version")
    String version;

    @Column(name = "status")
    String status;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
