package com.agribank.qldvutils.dao;

import java.util.Date;

public interface DVRecognitionDAO {
    String getId();
    String getDvCode();
    String getDvName();
    String getConclusionNumber();
    String getDecisionNumber();
    Date getConclusionDate();
    Date getDecisionDate();
}
