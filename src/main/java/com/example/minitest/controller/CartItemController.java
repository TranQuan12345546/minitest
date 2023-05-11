package com.example.minitest.controller;

import com.example.minitest.dto.CartItemDto;
import com.example.minitest.entity.Course;
import com.example.minitest.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cartItems")
public class CartItemController {
    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping("")
    public ResponseEntity<?> getListItem() {
        List<CartItemDto> result = cartItemService.getAllCartItem();
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCartItem(@PathVariable Integer id) {
        cartItemService.deleteCartItem(id);
        return ResponseEntity.ok("Delete successful");
    }

    @PutMapping("/{id}/increment")
    public ResponseEntity<?> incrementQuantity(@PathVariable Integer id) {
        cartItemService.incrementQuantity(id);
        return ResponseEntity.ok("increment");
    }

    @PutMapping("/{id}/decrement")
    public ResponseEntity<?> decrementQuantity(@PathVariable Integer id) {
        cartItemService.decrementQuantity(id);
        return ResponseEntity.ok("decrement");
    }
}
