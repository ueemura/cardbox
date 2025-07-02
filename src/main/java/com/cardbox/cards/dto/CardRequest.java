package com.cardbox.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardRequest {
    private String cardHolderName;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
}
