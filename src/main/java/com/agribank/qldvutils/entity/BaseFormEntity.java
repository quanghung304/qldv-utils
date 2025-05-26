package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

@Data
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
//base cho cac form co chung luong van ban
public class BaseFormEntity<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    T id;

    @Column(name = "desicion_committee")
    @Comment("cap quyet dinh")
    String decisionCommittee;
    @Column(name = "conclusion_number")
    @Comment("so ket luan/nghi quyet")
    String conclusionNumber;
    @Column(name = "conclusion_date") //ngay ket luan/nghi quyet
    @Comment("ngay ket luan/nghi quyet")
    Date conclusionDate;
    @Column(name = "decision_number")
    @Comment("so quyet dinh")
    String decisionNumber;
    @Column(name = "decision_date")
    @Comment("ngay quyet dinh")
    Date decisionDate;
    @Column(name = "effective_date")
    @Comment("ngay hieu luc")
    Date effectiveDate;

    @Column(name = "created_at")
    Timestamp createdAt;
    @Column(name = "updated_at")
    Timestamp updatedAt;

    public static Map<String, String> BASE_FIELD_MAP = Map.of(
            "decisionCommittee", "Cấp ủy quyết định",
            "conclusionNumber", "Số Kết luận/Nghị quyết",
            "conclusionDate", "Ngày Kết luận/Nghị quyết",
            "decisionNumber", "Số Quyết định",
            "decisionDate", "Ngày Quyết định",
            "effectiveDate", "Ngày hiệu lực"
    );

    @PrePersist
    protected void onCreate() {
        createdAt = new Timestamp(System.currentTimeMillis());
        updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }
}
