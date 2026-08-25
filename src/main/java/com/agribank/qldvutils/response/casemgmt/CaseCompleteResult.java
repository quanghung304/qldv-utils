package com.agribank.qldvutils.response.casemgmt;

import com.agribank.qldvutils.entity.Organization;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Kết quả trả về từ {@code CaseCompleteService.complete()} (qldv-db) cho qldv-api build response
 * — {@code newOrganizations} = tổ chức vừa tạo (Thành lập/Sáp nhập/Hợp nhất=1, Chia tách=N, rỗng
 * với Giải thể/Đổi tên); {@code affectedOrganizationIds} = TOÀN BỘ tổ chức bị đổi trạng thái/tên
 * (kể cả tổ chức con bị kéo theo khi cascade giải thể) — để FE hiển thị đủ, tránh người dùng bất
 * ngờ khi thấy nhiều TCĐ đổi trạng thái hơn số đã chọn ban đầu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseCompleteResult {
    List<Organization> newOrganizations;
    List<String> affectedOrganizationIds;
}
