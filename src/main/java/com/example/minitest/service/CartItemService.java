package com.example.minitest.service;

import com.example.minitest.dto.CartItemDto;
import com.example.minitest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartItemService {
    List<CartItemDto> getAllCartItem();

    boolean deleteCartItem(Integer id);

    boolean incrementQuantity(Integer id);
    boolean decrementQuantity(Integer id);
}
