package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "QLDV_ROLES")
public class Role extends BaseEntity<String> {
    @Column(name = "NAME")
    String name;
    @Column(name = "DESCRIPTION")
    String description;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
