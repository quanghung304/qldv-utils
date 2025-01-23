package com.agribank.qldvutils.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDataResponse extends DefaultResponse {
    @JsonProperty("MASO_TCD_USER")
    private String maTCDUser;
}
