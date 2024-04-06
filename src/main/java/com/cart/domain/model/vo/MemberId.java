package com.cart.domain.model.vo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor @AllArgsConstructor
public class MemberId {
    private Long memberId;
    private String memberName;

}
