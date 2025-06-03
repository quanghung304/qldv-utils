package com.agribank.qldvutils.entity.development_plan;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "QLDV_DEVELOPMENT_PLAN_DETAIL_DRAFT")
public class DevelopmentPlanDetailDraft extends BaseEntity<String> {
    @Column(name="PLANID")
    String refId;

    @Column(name="TARGET")
    Integer target;

    @Column(name="MIN")
    Integer min;

    @Column(name="YEAR")
    Integer year;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }

    public static Map<String, String> BASE_FIELD_MAP = Map.of(
            "target", "Chỉ tiêu",
            "min", "Tối thiểu",
            "year", "Năm"
    );
}
