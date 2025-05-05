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
@Table(name = "QLDV_DEVELOPMENT_PLAN_DETAIL")
public class DevelopmentPlanDetail extends BaseEntity<String>{
    @Column(name="REFID")
    String refId;

    @Column(name="TARGET_Y1")
    Integer target1;

    @Column(name="TARGET_Y2")
    Integer target2;

    @Column(name="TARGET_Y3")
    Integer target3;

    @Column(name="TARGET_Y4")
    Integer target4;

    @Column(name="TARGET_Y5")
    Integer target5;

    @Column(name="TARGET_Y6")
    Integer target6;

    @Column(name="MIN_Y1")
    Integer min1;

    @Column(name="MIN_Y2")
    Integer min2;

    @Column(name="MIN_Y3")
    Integer min3;

    @Column(name="MIN_Y4")
    Integer min4;

    @Column(name="MIN_Y5")
    Integer min5;

    @Column(name="MIN_Y6")
    Integer min6;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
