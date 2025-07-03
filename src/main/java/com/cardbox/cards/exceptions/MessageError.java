package com.cardbox.cards.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
@Getter
@Setter
@NoArgsConstructor
public class MessageError {
    private Integer status;
    private OffsetDateTime timestamp;
    private String title;
    private String message;
}
