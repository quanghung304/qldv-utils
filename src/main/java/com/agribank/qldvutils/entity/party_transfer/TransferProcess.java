package com.agribank.qldvutils.entity.party_transfer;

import com.agribank.qldvutils.entity.BaseEntity;
import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Data
@Builder
@Entity
@Table(name = "qldv_transfer_process", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//bang tam luu tinh trang CSH dang cua dang vien
public class TransferProcess extends BaseEntity<String> {
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "full_name")
    String fullName;
    @Column(name = "transfer_type")
    @Comment("0:TRANSFER_TO_AGRIBANK, 1:TRANSFER_OUT_AGRIBANK, 2:TRANSFER_WITHIN_AGRIBANK, 3:TRANSFER_WITHIN_BASE, 4:TEMPORARY_TRANSFER")
    Integer transferType;
    @Column(name = "organization_code")
    @Comment("ma to chuc dang tiep nhan")
    String organizationCode;
    @Comment("trang thai - 0: chua xu ly, 1: da xu ly")
    Integer status;
}
