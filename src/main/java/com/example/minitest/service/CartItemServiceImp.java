package com.example.minitest.service;

import com.example.minitest.dto.CartItemDto;
import com.example.minitest.entity.CartItem;
import com.example.minitest.exception.NotFoundException;
import com.example.minitest.mapper.CartItemMapper;
import com.example.minitest.repository.CourseDB;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.example.minitest.repository.CourseDB.cartItems;

@Component
public class CartItemServiceImp implements CartItemService{
    @Override
    public List<CartItemDto> getAllCartItem() {
        ArrayList<CartItemDto> result = new ArrayList<>();
        result.add(CartItemMapper.toCartItemDto(cartItems.get(0), CourseDB.courses.get(0)));
        result.add(CartItemMapper.toCartItemDto(cartItems.get(1), CourseDB.courses.get(1)));
        result.add(CartItemMapper.toCartItemDto(cartItems.get(2), CourseDB.courses.get(2)));
        return result;
    }

    @Override
    public boolean deleteCartItem(Integer id) {
        for (CartItem cartItem : cartItems) {
            if(cartItem.getId() == id) {
                cartItems.remove(cartItem);
                return true;
            }
        }
        throw new NotFoundException("No user found");
    }

    @Override
    public boolean incrementQuantity(Integer id) {
        for (CartItem cartItem : cartItems) {
            if(cartItem.getId() == id) {
                cartItem.setCount(cartItem.getCount() + 1);
                return true;
            }
        }
        throw new NotFoundException("No id found");
    }

    @Override
    public boolean decrementQuantity(Integer id) {
        for (CartItem cartItem : cartItems) {
            if(cartItem.getId() == id) {
                if (cartItem.getCount() > 1) {
                    cartItem.setCount(cartItem.getCount() - 1);
                    return true;
                }
            }
        }
        throw new NotFoundException("No id found");
    }


}
