package com.cart.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Item {
    private Integer no;
    private String title;
    private Integer stocks;
    private Integer price;

    public static Item sample() {
        return new Item(1, "title", 10, 1000);
    }

    public void addStocks(int stocks) {
        this.stocks += stocks;
    }
    public void removeStocks(int stocks) {
        if(stocks > this.stocks) throw new IllegalArgumentException("재고가 부족합니다.");
        this.stocks -= stocks;
    }
}
