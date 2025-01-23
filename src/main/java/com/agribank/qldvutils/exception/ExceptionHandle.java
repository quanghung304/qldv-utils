package com.agribank.qldvutils.exception;

import com.agribank.qldvutils.response.DefaultResponse;
import com.agribank.qldvutils.response.ResponseHandle;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.ClientAbortException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = CommonException.class)
    public ResponseEntity<DefaultResponse> exception(CommonException exception) {
        return ResponseHandle.error(exception.getMessage());
    }
//
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity<DefaultResponse> exception(MissingServletRequestParameterException exception) {
        return ResponseHandle.error("Không được để trống param " + exception.getParameterName());
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<DefaultResponse> exception(Exception exception) {
        if (exception instanceof ClientAbortException) {
            // luồng hiện tại bị ngắt do call Thread.currentThread().interrupt()
            // => k xử lý, nếu k sẽ trả về đồng thời 2 response
            return null;
        }

        return ResponseHandle.error(exception.getMessage());
    }

    @ExceptionHandler(value = MissingRequestHeaderException.class)
    public ResponseEntity<DefaultResponse> exception(MissingRequestHeaderException exception) {
        return ResponseHandle.error(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    public ResponseEntity<DefaultResponse> exception(AccessDeniedException exception) {
        return ResponseHandle.error(exception.getMessage(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );
        return ResponseEntity.badRequest().body(errors);
    }
}