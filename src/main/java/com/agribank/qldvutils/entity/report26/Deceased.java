package com.agribank.qldvutils.entity.report26;

import com.agribank.qldvutils.entity.BaseEntity;
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
@Table(name = "qldv_deceased")
public class Deceased extends BaseEntity<String> {
//    @Column(name = "death_certificate_number")
//    @Comment("Số chứng tử")
//    String deathCertificateNumber;
//    @Column(name = "issuance_date")
//    @Comment("Ngày ban hành")
//    Date issuanceDate;
    @Column(name = "date_of_death")
    @Comment("Ngày từ trần")
    Date dateOfDeath;
}
