package com.example.minitest.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true, setterPrefix = "with")
public class CartItem {
    private Integer id;
    private Integer courseId;
    @Size(min = 1, message = "count must higher than 1")
    private Integer count;
}
