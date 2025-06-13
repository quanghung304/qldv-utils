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

import static java.util.Map.entry;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_dv", schema = Constants.DV_DL)
public class DV extends BaseEntity<String>{
    @Column(name = "staff_code")
    String staffCode;
    //Mã tcd
    @Column(name = "organization_code")
    String organizationCode;
    //Số lý lịch
    @Column(name = "resume_number")
    String resumeNumber;
    //số thẻ Đảng viên
    @Column(name = "party_card_number")
    String partyCardNumber;
    //ngày cấp thẻ Đảng
    @Column(name = "issue_date")
    Date issueDate;
    //cccd
    String vneid;
    @Column(name = "full_name")
    String fullName;
    @Comment("M/F: male/female")
    String gender;
    //họ tên đang sử dụng
    @Column(name = "using_name")
    String usingName;
    Date birthday;
    @Column(name = "birth_place")
    String birthPlace;
    String hometown;
    //hộ khẩu thường trú
    @Column(name = "permanent_residence")
    String permanentResidence;
    //tạm trú
    @Column(name = "temporary_residence")
    String temporaryResidence;
    //dân tộc
    String ethnic;
    //Tôn giáo
    String religion;
    //thành phần gia đình
    @Column(name = "family_composition")
    String familyComposition;
    //Gia đình liệt sĩ
    @Column(name = "martyrs_family")
    @Comment("Y/N")
    String martyrsFamily;
    //Có công với cachs mạng
    @Comment("Y/N")
    String revolution;
    //Thành phần xã hội khi vào Đảng
    @Column(name = "social_composition")
    String socialComposition;
    //công việc chính đang làm
    @Column(name = "main_job")
    String mainJob;
    //Ngày kết nạp Đảng
    @Column(name = "admission_date")
    Date admissionDate;
    //nguồn kết nạp
    @Column(name = "source_recruitment")
    @Comment("sinh viên, đảng bộ ngoài Agribank")
    String sourceRecruitment;
    //Kết nạp tại chi bộ
    @Column(name = "branch_party_code")
    String branchPartyCode;
    //công đoàn giới thiệu
    @Column(name = "suggestion_union")
    @Comment("Y/N")
    String suggestionUnion;
    //Đoàn thanh niên giới thiệu
    @Column(name = "suggestion_youth_union")
    @Comment("Y/N")
    String suggestionYouthUnion;
    //Người giới thiệu 1
    String referrer1;
    //Chức vụ đơn vị của người giới thiệu;
    @Column(name = "job_position1")
    String jobPosition1;
    String referrer2;
    @Column(name = "job_position2")
    String jobPosition2;
    //Ngày công nhận chính thức
    @Column(name = "official_recognition_day")
    Date officialRecognitionDay;
    //tham gia tổ chức khác
    @Column(name = "recruit_another_organization")
    String recruitAnotherOrganization;
    //Ngày tuyển vào Agribank
    @Column(name = "agri_recruit_date")
    Date agriRecruitDate;
    //Chi nhánh tuyển dụng
    @Column(name = "recruit_brcd")
    String recruitBrcd;
    //Ngày vào Đoàn
    @Column(name = "youth_union_join_date")
    Date youthUnionJoinDate;
    //Tổ chức xã hội khác
    @Column(name = "other_social_organization")
    String otherSocialOrganization;
    //Ngày nhập ngũ
    @Column(name = "enlistment_date")
    Date enlistmentDate;
    //Ngày xuất ngũ
    @Column(name = "discharge_date")
    Date dischargeDate;
    //Loại thương binh
    @Column(name = "disabled_type")
    Integer disabledType;
    //Có vấn đề chính trị
    @Column(name = "political_issue")
    @Comment("Y/N")
    String politicalIssue;
    //Chế độ cũ
    @Column(name = "old_regime")
    @Comment("Y/N")
    String oldRegime;
    //Xuất thân là công nhân
    @Column(name = "former_worker")
    @Comment("Y/N")
    String formerWorker;
    //Kết hôn với người nước ngoài
    @Column(name = "foreign_marriage")
    @Comment("Y/N")
    String foreignMarriage;
    @Column(name = "foreign_related")
    @Comment("Có liên quan đến yếu tố nước ngoài: Y/N")
    String foreignRelated;
    @Comment("Trình độ")
    String degree;
    @Comment("Học vấn phổ thông: 10/10, 12/12, khác")
    String education;
    @Column(name = "health_condition")
    @Comment("Tình trạng sức khỏe bản thân: Tốt/ bình thường/ khác")
    String healthCondition;
    @Column(name = "date_of_death")
    @Comment("Ngày, tháng, năm từ trần")
    String dateOfDeath;
    @Column(name = "dv_status")
    @Comment("1: cho chuyen SHD, 2: SHD tam thoi, 3: da chuyen SHD ra ngoai Agribank")
    String dvStatus;

    @Comment("ma can bo thuc hien")
    @Column(name = "created_by")
    String createdBy;
    @Comment("ma can bo duyet")
    @Column(name = "approved_by")
    String approvedBy;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(new LinkedHashMap<>() {
        {
            put("organizationCode", "Mã chi, đảng bộ");
            put("resumeNumber", "Số lý lịch");
            put("partyCardNumber", "Số thẻ đảng viên");
            put("vneid", "Số CCCD");
            put("fullName", "Họ tên khai sinh");
            put("gender", "Giới tính");
            put("usingName", "Họ tên đang dùng");
            put("birthday", "Ngày sinh");
            put("birthPlace", "Nơi sinh");
            put("hometown", "Quê quán");
            put("permanentResidence", "Nơi đăng ký hộ khẩu thường trú");
            put("temporaryResidence", "Nơi đăng ký tạm trú hiện nay");
            put("ethnic", "Dân tộc");
            put("religion", "Tôn giáo");
            put("familyComposition", "Thành phần gia đình");
            put("martyrsFamily", "Gia đình liệt sĩ");
            put("revolution", "Gia đình có công với cách mạng");
            put("socialComposition", "Thành phần xã hội khi vào đảng");
            put("mainJob", "Công việc chính đang làm");
            put("admissionDate", "Ngày kết nạp đảng");
            put("sourceRecruitment", "Nguồn kết nạp đảng");
            put("branchPartyCode", "Kết nạp tại chi bộ");
            put("suggestionUnion", "Công đoàn giới thiệu");
            put("suggestionYouthUnion", "Đoàn thanh niên giới thiệu");
            put("referrer1", "Người giới thiệu thứ nhất");
            put("jobPosition1", "Chức vụ, đơn vị của người giới thiệu 1");
            put("referrer2", "Người giới thiệu thứ hai");
            put("jobPosition2", "Chức vụ, đơn vị của người giới thiệu 2");
            put("officialRecognitionDay", "Ngày công nhận chính thức");
            put("recruitAnotherOrganization", "Tuyển dụng, tham gia tổ chức khác");
            put("agriRecruitDate", "Ngày được tuyển dụng làm cán bộ Agribank");
            put("recruitBrcd", "'Đơn vị/Chi nhánh tuyển dụng");
            put("youthUnionJoinDate", "Ngày vào Đoàn");
            put("otherSocialOrganization", "Tên tổ chức xã hội khác tham gia");
            put("enlistmentDate", "Ngày nhập ngũ");
            put("dischargeDate", "Ngày xuất ngũ");
            put("disabledType", "Loại thương binh");
            put("politicalIssue", "Có vấn đề lịch sử chính trị");
            put("oldRegime", "Bản thân có làm việc trong chế độ cũ");
            put("formerWorker", "Xuất thân là công nhân");
            put("foreignMarriage", "Kết hôn với người nước ngoài");
            put("foreignRelated", "Có liên quan đến yếu tố nước ngoài");
            put("degree", "Trình độ");
            put("education", "Học vấn phổ thông");
            put("healthCondition", "Tình trạng sức khỏe");
            put("dateOfDeath", "Ngày từ trần");
        }}
    );
}
