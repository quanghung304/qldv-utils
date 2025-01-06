package com.agribank.qldvutils.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//dung cho response cua api
public class DefaultResponse {
    private Boolean check;
    private String message;
}
