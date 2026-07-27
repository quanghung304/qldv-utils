package com.agribank.qldvutils.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Data
@Builder
public class PageDefaultResponse<T>{
    private Boolean success;
    private String message;
    private Integer total;
    private Integer currentPage;
    private Long totalItems;
    private List<T> data;

    public static <T> ResponseEntity<PageDefaultResponse<T>>success(List<T> data, Integer total,
                                                                      Integer currentPage, Long totalItems) {
        return new ResponseEntity<>(PageDefaultResponse.<T>builder()
                .success(true)
                .message("success")
                .data(data)
                .total(total)
                .currentPage(currentPage)
                .totalItems(totalItems)
                .build(), HttpStatus.OK);
    }

    public static <T> ResponseEntity<PageDefaultResponse<T>> error(String message) {
        return new ResponseEntity<>(PageDefaultResponse.<T>builder()
                .success(false)
                .message(message)
                .build(), HttpStatus.BAD_REQUEST);
    }
}
