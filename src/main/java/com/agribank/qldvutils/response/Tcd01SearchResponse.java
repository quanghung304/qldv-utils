package com.agribank.qldvutils.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tcd01SearchResponse extends DefaultResponse{
    Integer total;
    Integer currentPage;
    Long totalItems;
    List<Tcd01Response> data;
}
