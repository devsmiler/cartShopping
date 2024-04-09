package com.cart.framework.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/line-items")
public class CartController {
    @GetMapping
    void list() {
        // TODO: Return DTO containing cart line items.
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create() {
        // TODO: Add product to cart.
    }
}
