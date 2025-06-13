package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_recognition_draft", schema = Constants.DV_DL)
public class DVRecognitionDraft extends BaseDraftEntity{
    //Ma can bo
    @Column(name = "staff_code")
    String staffCode;
    //Ten can bo
    @Column(name = "staff_name")
    String staffName;
    //So KL/Nghi Quyet
    @Column(name = "conclusion_number")
    String conclusionNumber;
    //So quyet dinh
    @Column(name = "decision_number")
    String decisionNumber;
    //Ngay KL/Nghi quyet
    @Column(name = "conclusion_date")
    Date conclusionDate;
    //Ngay QD
    @Column(name = "decision_date")
    Date decisionDate;
    @Column(name = "ref_id")
    String refId;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("staffCode", "Mã cán bộ");
                    put("staffName", "Tên cán bộ");
                    put("conclusionNumber", "Số KL/Nghị quyết");
                    put("decisionNumber", "Số quyết định");
                    put("conclusionDate", "Ngày KL/Nghị quyết");
                    put("decisionDate", "Ngày quyết định");
                }}
    );
}
