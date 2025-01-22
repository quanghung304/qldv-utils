package com.agribank.qldvutils.request.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckDataRequest {
    @NotNull(message = "không được bỏ trống")
    String action;
    @NotNull(message = "không được bỏ trống")
    String table;
    @JsonProperty("ma_tcd")
    String maTCD;
    List<Field> fields;

    @Data
    @Builder
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Field {
        @JsonProperty("old_value")
        String oldValue;
        @JsonProperty("new_value")
        String newValue;
        String name;
    }

    public void addField(String fieldName, String oldValue, String newValue) {
        Field field = new Field(oldValue, newValue, fieldName);
        this.fields.add(field);
    }
}
