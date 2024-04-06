package com.cart.domain.model;

import com.cart.domain.model.vo.CartDateTime;
import com.cart.domain.model.vo.CartId;
import com.cart.domain.model.vo.CartStatus;
import com.cart.domain.model.vo.MemberId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "TB_CART")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @EmbeddedId
    private CartId cartId;

    @Embedded
    private MemberId memberId;

    @Embedded
    private CartStatus cartStatus;

    @ElementCollection
    private List<CartItem> cartItems = new ArrayList<CartItem>();

    private Integer totalPrice;

    @Embedded
    private CartDateTime cartDateTime;

    public static Cart createCart(MemberId memberId) {
        return new Cart(
                CartId.createCartId(),
                memberId,
                CartStatus.CART_IN_USE,
                new ArrayList<CartItem>(),
                0,
                CartDateTime.createCartDateTime());
    }

    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }
    public void removeCartItem(CartItem cartItem) {
        cartItems.remove(cartItem);
    }
    private void checkAddCartItem(CartItem cartItem) {
        if (cartItems.contains(cartItem)) {
            throw new IllegalArgumentException("이미 장바구니에 담긴 상품입니다.");
        }
    }
    private void calculateTotalPrice() {
        // 장바구니에 담긴 상품들의 가격을 합산하여 총 가격을 계산한다.
        cartItems.forEach(cartItem -> totalPrice += cartItem.getPrice());

    }
}
