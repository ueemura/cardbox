package com.cardbox.cards.util;

import com.cardbox.cards.dto.CardRequest;
import com.cardbox.cards.exceptions.BusinessException;
import com.cardbox.cards.exceptions.MessageErrorEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.YearMonth;

@ApplicationScoped
public class CardValidator {

    public void validate(CardRequest card) {
        if (card.getCardHolderName().trim().length() < 3) {
            throw new BusinessException(MessageErrorEnum.INVALID_CARDHOLDER_NAME.getMessage());
        }

        if (
                !isValidCardNumberFormat(card.getCardNumber()) ||
                        !isValidLuhn(card.getCardNumber())) {
            throw new BusinessException(MessageErrorEnum.INVALID_CARD_NUMBER.getMessage());
        }

        if (!isValidExpirationDate(card.getExpirationMonth(), card.getExpirationYear())) {
            throw new BusinessException(MessageErrorEnum.INVALID_EXPIRATION_DATE.getMessage());
        }


    }

    private boolean isValidExpirationDate(String expirationMonth, String expirationYear) {
        try {
            int month = Integer.parseInt(expirationMonth);
            int year = Integer.parseInt(expirationYear);
            if (month < 1 || month > 12) return false;
            YearMonth expiration = YearMonth.of(year, month);
            return !expiration.isBefore(YearMonth.now());
        } catch (Exception e) {
            return false;
        }


    }

    private boolean isValidCardNumberFormat(String cardNumber) {
        return cardNumber.matches("\\d{13,19}");
    }

    private boolean isValidLuhn(String cardNumber) {
        int sum = 0;
        boolean even = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = cardNumber.charAt(i) - '0';
            sum += even ? (digit > 4 ? digit * 2 - 9 : digit * 2) : digit;
            even = !even;
        }
        return sum % 10 == 0;
    }
}
