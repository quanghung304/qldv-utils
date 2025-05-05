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
@Table(name = "QLDV_DEVELOPMENT_PLAN")
public class DevelopmentPlan extends BaseEntity<String> {
    @Column(name = "BRCD")
    String brcd;

    @Column(name = "NAME")
    String name;

    @Column(name = "SESSIONS")
    String sessions;

    @Column(name = "TARGET")
    Integer target;

    @Column(name = "PRNTBRCD")
    String prntBrcd;

    @Column(name = "ORGANIZE_LEVEL")
    Integer level;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
