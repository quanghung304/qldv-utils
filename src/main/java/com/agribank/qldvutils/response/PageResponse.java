package com.agribank.qldvutils.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse<T>{
    Integer totalPages;
    Integer currentPage;
    Long totalItems;
    List<T> data;
}
