package com.agribank.qldvutils.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandle {

    public static <T extends DefaultResponse> ResponseEntity<T> success(T response) {
        response.setCheck(true);
        response.setMessage("success");
        return ResponseEntity.ok(response);
    }

    public static <T extends DefaultResponse> ResponseEntity<T> success(T response, String message) {
        response.setCheck(true);
        response.setMessage(message);
        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<DefaultResponse> error(String message) {
        DefaultResponse response = new DefaultResponse(false, message);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(response);
    }

    public static ResponseEntity<DefaultResponse> error(String message, HttpStatus status) {
        DefaultResponse response = new DefaultResponse(false, message);
        return ResponseEntity
                .status(status)
                .body(response);
    }
}
