package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.Case;
import com.agribank.qldvutils.entity.CaseEstablishment;
import com.agribank.qldvutils.entity.CaseEstablishmentCommittee;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Gói toàn bộ thao tác ghi của API-SC02-01/02 thành 1 lệnh gửi xuống qldv-db, để chạy trong
 * ĐÚNG 1 transaction (thay vì 4 lệnh Feign rời rạc, mỗi lệnh tự commit riêng — nếu lệnh sau lỗi
 * thì lệnh trước đã lưu vẫn còn, làm dữ liệu nửa vời). qldv-db CHỈ thực thi persist + tự gán lại
 * case_id cho các bảng con sau khi biết id của Case vừa lưu — không tự thẩm định/validate gì
 * thêm (toàn bộ validate/business rule đã chạy xong ở qldv-api TRƯỚC khi gọi xuống đây).
 *
 * {@code committeeMembers} null = không đụng tới danh sách cấp ủy dự kiến hiện có; non-null
 * (kể cả rỗng) = xóa hết rồi ghi lại đúng danh sách này. {@code attachmentIdsToLink} null/rỗng =
 * không đụng tới tệp đính kèm; non-null = gán case_id cho đúng các attachment_id này (qldv-api đã
 * xác nhận các id này tồn tại trước khi gửi xuống).
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EstablishmentCasePersistRequest {
    Case caseEntity;
    CaseEstablishment establishment;
    List<CaseEstablishmentCommittee> committeeMembers;
    List<String> attachmentIdsToLink;
}
