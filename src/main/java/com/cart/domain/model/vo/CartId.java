package com.cart.domain.model.vo;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Embeddable
public class CartId implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String id;

    public static CartId createCartId() {
        UUID u = UUID.randomUUID();
        String year = String.valueOf(LocalDate.now().getYear());
        CartId cartId = new CartId();
        String str  = year+"-"+u;
        cartId.setId(str);
        return cartId;
    }
}
