package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.CommitteeMember;
import com.agribank.qldvutils.entity.Organization;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * 1 tổ chức đảng mới cần tạo ở API-SC06-02 (Thành lập=1 phần tử, Sáp nhập/Hợp nhất=1 phần tử,
 * Chia tách=N phần tử) + danh sách cấp ủy chính thức đi kèm — {@code organization} chưa có id
 * (qldv-db tự gán sau khi save, giống {@code EstablishmentCasePersistRequest}).
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewOrganizationEntry {
    Organization organization;
    List<CommitteeMember> committee;
}
