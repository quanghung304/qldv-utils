package com.agribank.qldvutils.request;

import jakarta.validation.ValidationException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagingRequest {
    private Integer page;
    private Integer pageSize;
    private String sort = "ASC";
    private String orderBy;

    public void validate(){
        if (Objects.isNull(page)) {
            throw new ValidationException("page must not be null");
        }

        if (Objects.isNull(pageSize)) {
            throw new ValidationException("pageSize must not be null");
        }
    }
}
