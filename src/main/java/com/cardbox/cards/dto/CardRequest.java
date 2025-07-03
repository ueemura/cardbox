package com.cardbox.cards.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardRequest {

    @NotNull(message = "Cardholder name is required.")
    private String cardHolderName;

    @NotNull(message = "Card number is required.")
    private String cardNumber;

    @NotNull(message = "Expiration month is required")
    private String expirationMonth;

    @NotNull(message = "Expiration year is required")
    private String expirationYear;
}
