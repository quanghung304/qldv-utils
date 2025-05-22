package com.agribank.qldvutils.dao;

import java.util.Date;

public interface RequestDAO {
    String getId();
    Integer getType();
    String getFormCode();
    String getFormName();
    String getOldData();
    String getNewData();
    Date getCreatedAt();
    String getCreator();
    String getApprover();
    Date getApprovedAt();
    Integer getStatus();
    String getDeniedReason();
}
