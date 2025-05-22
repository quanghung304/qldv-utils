package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
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
@Table(name = "qldv_religion", schema = Constants.DV_DL)
public class Religion extends BaseEntity<String> {
    String name;

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }

    @Override
    protected void onCreate() {
        super.onCreate();
    }
}
