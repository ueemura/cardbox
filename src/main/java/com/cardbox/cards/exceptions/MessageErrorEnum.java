package com.cardbox.cards.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageErrorEnum {

    INVALID_CARDHOLDER_NAME("Invalid cardholder name."),
    INVALID_CARD_NUMBER("Invalid card number."),
    INVALID_EXPIRATION_DATE("Invalid or expired expiration date.");

    private final String message;

}
