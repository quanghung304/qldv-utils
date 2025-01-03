package com.agribank.qldvutils.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagingRequest {
    private Integer page;
    private Integer pageSize;
    private String sort = "ASC";
}
