package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_api_log")
public class ApiLog extends BaseEntity<String> {
    String username;
    @Column(name = "user_email")
    String email;
    String action;
    @Column(name = "reference_id")
    String referenceId;
    @Column(name = "object_reference")
    String objectReference;
    @Column(name = "object_name")
    String objectName;
    @Column(name = "data_type")
    String dataType;
    @Column(name = "description")
    String description;
    @Column(name = "brcd")
    Integer brcd;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
