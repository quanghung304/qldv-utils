package com.agribank.qldvutils.request.tcd;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tcd01SearchRequest extends PagingRequest {
    private String maSoTcd;
    private String maSo;
    private String ten;
    private String hinhThuc;
    private Date ngayTl;
}
