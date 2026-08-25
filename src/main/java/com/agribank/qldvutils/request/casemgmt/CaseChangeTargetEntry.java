package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.CaseChangeTarget;
import com.agribank.qldvutils.entity.CaseChangeTargetCommittee;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/** 1 tổ chức đích + danh sách cấp ủy dự kiến của nó — dùng trong {@code CaseChangePersistRequest}. */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseChangeTargetEntry {
    CaseChangeTarget target;
    List<CaseChangeTargetCommittee> committee;
}
