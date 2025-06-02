package com.agribank.qldvutils.entity;

import com.agribank.qldvutils.enums.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;
import java.util.Date;
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
    Timestamp birthday;
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

    public static Map<String, String> FIELD_MAP = Map.ofEntries(
            entry("organizationCode", "Mã chi, đảng bộ"),
            entry("resumeNumber", "Số lý lịch"),
            entry("partyCardNumber", "Số thẻ đảng viên"),
            entry("vneid", "Số CCCD"),
            entry("fullName", "Họ tên khai sinh"),
            entry("gender", "Giới tính"),
            entry("usingName", "Họ tên đang dùng"),
            entry("birthday", "Ngày sinh"),
            entry("birthPlace", "Nơi sinh"),
            entry("hometown", "Quê quán"),
            entry("permanentResidence", "Nơi đăng ký hộ khẩu thường trú"),
            entry("temporaryResidence", "Nơi đăng ký tạm trú hiện nay"),
            entry("ethnic", "Dân tộc"),
            entry("religion", "Tôn giáo"),
            entry("familyComposition", "Thành phần gia đình"),
            entry("martyrsFamily", "Gia đình liệt sĩ"),
            entry("revolution", "Gia đình có công với cách mạng"),
            entry("socialComposition", "Thành phần xã hội khi vào đảng"),
            entry("mainJob", "Công việc chính đang làm"),
            entry("admissionDate", "Ngày kết nạp đảng"),
            entry("sourceRecruitment", "Nguồn kết nạp đảng"),
            entry("branchPartyCode", "Kết nạp tại chi bộ"),
            entry("suggestionUnion", "Công đoàn giới thiệu"),
            entry("suggestionYouthUnion", "Đoàn thanh niên giới thiệu"),
            entry("referrer1", "Người giới thiệu thứ nhất"),
            entry("jobPosition1", "Chức vụ, đơn vị của người giới thiệu 1"),
            entry("referrer2", "Người giới thiệu thứ hai"),
            entry("jobPosition2", "Chức vụ, đơn vị của người giới thiệu 2"),
            entry("officialRecognitionDay", "Ngày công nhận chính thức"),
            entry("recruitAnotherOrganization", "Tuyển dụng, tham gia tổ chức khác"),
            entry("agriRecruitDate", "Ngày được tuyển dụng làm cán bộ Agribank"),
            entry("recruitBrcd", "'Đơn vị/Chi nhánh tuyển dụng"),
            entry("youthUnionJoinDate", "Ngày vào Đoàn"),
            entry("otherSocialOrganization", "Tên tổ chức xã hội khác tham gia"),
            entry("enlistmentDate", "Ngày nhập ngũ"),
            entry("dischargeDate", "Ngày xuất ngũ"),
            entry("disabledType", "Loại thương binh"),
            entry("politicalIssue", "Có vấn đề lịch sử chính trị"),
            entry("oldRegime", "Bản thân có làm việc trong chế độ cũ"),
            entry("formerWorker", "Xuất thân là công nhân"),
            entry("foreignMarriage", "Kết hôn với người nước ngoài"),
            entry("foreignRelated", "Có liên quan đến yếu tố nước ngoài"),
            entry("degree", "Trình độ"),
            entry("education", "Học vấn phổ thông"),
            entry("healthCondition", "Tình trạng sức khỏe"),
            entry("dateOfDeath", "Ngày từ trần")
    );
}
