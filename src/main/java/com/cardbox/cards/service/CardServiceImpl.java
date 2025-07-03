package com.cardbox.cards.service;

import com.cardbox.cards.dto.CardRequest;
import com.cardbox.cards.util.CardValidator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class CardServiceImpl implements CardService{

    @Inject
    CardValidator cardValidator;

    @Override
    public String createCard(CardRequest request) {
        cardValidator.validate(request);
        return "";
    }
}
