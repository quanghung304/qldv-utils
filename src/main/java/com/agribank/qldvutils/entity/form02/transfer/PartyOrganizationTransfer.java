package com.agribank.qldvutils.entity.form02.transfer;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "qldv_party_organization_transfer")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrganizationTransfer extends BaseFormEntity<String> {
    @Column(name = "receiving_org_name")
    @Comment("Tên chi, đảng bộ tiếp nhận")
    String receivingOrgName;
    @Column(name = "receiving_org_code")
    @Comment("Mã  chi, đảng bộ tiếp nhận")
    String receivingOrgCode;
}
