package com.agribank.qldvutils.entity.development_plan;

import com.agribank.qldvutils.entity.BaseEntity;
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
public class DevelopmentPlanDetail extends BaseEntity<String> {
    @Column(name="PLANID")
    String refId;

    @Column(name="TARGET")
    Integer target;

    @Column(name="MIN")
    Integer min;

    @Column(name="YEAR")
    Integer year;

    @Column(name = "STRIVE")
    Integer strive;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
