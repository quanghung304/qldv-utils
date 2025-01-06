package com.agribank.qldvutils.response;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
//dung chung cho giao tiep giua api va database
public class BaseResponse<T> {
    public Boolean success;
    public String message;
    public T data;

    public static <T> ResponseEntity<BaseResponse<T>> success(T data) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.success = true;
        response.data = data;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BaseResponse<T>> success(String message, T data) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.success = true;
        response.message = message;
        response.data = data;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BaseResponse<T>> error(String message) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.success = false;
        response.message = message;
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BaseResponse<T>> error(String message, HttpStatus code) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.success = false;
        response.message = message;
        return new ResponseEntity<>(response, code);
    }
}
