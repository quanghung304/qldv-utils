package com.agribank.qldvutils.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//dung chung cho giao tiep giua api va database
public class DefaultListResponse<T> {
    private Boolean success;
    private String message;
    private List<T> data;

    public static <T> ResponseEntity<DefaultListResponse<T>> success(List<T> data) {
        return new ResponseEntity<>(DefaultListResponse.<T>builder()
                .success(true)
                .data(data)
                .build(), HttpStatus.OK);
    }

    public static <T> ResponseEntity<DefaultListResponse<T>> error(String message) {
        return new ResponseEntity<>(DefaultListResponse.<T>builder()
                .success(false)
                .message(message)
                .build(), HttpStatus.OK);
    }
}
