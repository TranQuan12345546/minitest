package com.example.minitest.dto;

import com.example.minitest.entity.CartItem;
import com.example.minitest.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private Integer id;
    private Course course;
    private Integer count;
}
