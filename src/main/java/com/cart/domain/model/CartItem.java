package com.cart.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "TB_CART_ITEM")
@NoArgsConstructor
@Embeddable
public class CartItem {
    private String itemId;
    private String itemName;
    private int quantity;
    private int price;

    public CartItem(String itemId, String itemName, int quantity, int price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public static CartItem createCartItem() {
        return new CartItem("itemId", "itemName", 1, 100);
    }
}
