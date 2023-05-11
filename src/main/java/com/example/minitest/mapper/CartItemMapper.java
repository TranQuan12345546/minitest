package com.example.minitest.mapper;

import com.example.minitest.dto.CartItemDto;
import com.example.minitest.entity.CartItem;
import com.example.minitest.entity.Course;

public class CartItemMapper {
    public static CartItemDto toCartItemDto(CartItem cartItem, Course course) {
        CartItemDto cartItemDto = new CartItemDto();
        cartItemDto.setId(cartItem.getId());
        cartItemDto.setCourse(course);
        cartItemDto.setCount(cartItem.getCount());
        return cartItemDto;
    }
}
