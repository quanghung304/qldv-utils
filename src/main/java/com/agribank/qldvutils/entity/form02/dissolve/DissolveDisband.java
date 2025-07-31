package com.agribank.qldvutils.entity.form02.dissolve;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_dissolve_disband")
public class DissolveDisband extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    String name;
    String form;
    @Comment("0: thanh lap, 6: giai the")
    Integer type;
}
