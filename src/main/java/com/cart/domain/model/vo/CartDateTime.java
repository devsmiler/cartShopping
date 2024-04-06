package com.cart.domain.model.vo;

import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
@Data
public class CartDateTime {
    @CreationTimestamp
    private LocalDateTime cartCreatedDateTime;
    @UpdateTimestamp
    private LocalDateTime cartUpdatedDateTime;

    public static CartDateTime createCartDateTime() {
        return new CartDateTime();
    }

}
