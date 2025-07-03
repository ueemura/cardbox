package com.cardbox.cards.exceptions;

import jakarta.xml.bind.ValidationException;

public class BusinessException extends RuntimeException
{
    public BusinessException(String message){
        super(message);
    }
}
