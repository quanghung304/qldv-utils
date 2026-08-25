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
@Table(name = "PMDV_NOTIFICATION_RECIPIENT")
public class NotificationRecipient extends BaseEntity<String> {
    @Column(name = "ref_id")
    String refId;
    @Column(name = "user_id")
    String userId;
    @Column(name = "is_seen", length = 1)
    Integer isSeen;
}
