package com.agribank.qldvutils.request.tcd_xl;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.Data;

@Data
public class TcdXlSearchUtilRequest extends PagingRequest {
    private String maSoTcdl;
    private String maSo;
    private Integer nam;
    private String soQd;
    private String ngayQd;
}
