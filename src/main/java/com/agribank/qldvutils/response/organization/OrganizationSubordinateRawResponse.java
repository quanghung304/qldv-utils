package com.agribank.qldvutils.response.organization;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu native query
 * Oracle CONNECT BY (START WITH parent_organization_id = :organizationId) trên PMDV_ORGANIZATION
 * — chỉ gồm cột gốc + depthLevel (LEVEL của CONNECT BY). KHÔNG join PMDV_ORGANIZATION_TYPE ở
 * đây — qldv-api tự enrich organizationTypeCode/organizationTypeName bằng fetchTypeMap() đã có
 * sẵn (tái sử dụng, tránh CONNECT BY kết hợp JOIN trong cùng 1 câu native SQL).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSubordinateRawResponse {
    String id;
    String organizationCode;
    String organizationName;
    String organizationTypeId;
    Integer brcd;
    String parentOrganizationId;
    Integer operationStatus;
    Integer memberCount;
    Integer committeeMemberCount;
    Integer depthLevel;
}
