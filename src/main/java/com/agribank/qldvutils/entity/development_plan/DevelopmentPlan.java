package com.agribank.qldvutils.entity.development_plan;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.*;
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
    @Column(name = "ORGANIZATION_CODE")
    String organizationCode;

    @Column(name = "NAME")
    String name;

    @Column(name = "START_YEAR")
    Integer start;

    @Column(name = "END_YEAR")
    Integer end;

    @Column(name = "TARGET")
    Integer target;

    @Column(name = "PRNT_CODE")
    String prntCode;

    @Column(name = "HAS_CHILD")
    Integer hasChild;

    @Builder.Default
    Integer deleted = 0;

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }

    @Override
    protected void onCreate() {
        super.onCreate();
    }
}
