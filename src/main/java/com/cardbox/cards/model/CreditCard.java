package com.cardbox.cards.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_card")
public class CreditCard extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cardholder_name")
    private String cardHolderName;

    @Column(name = "card_number_encrypted")
    private String cardNumberEncrypted;

    @Column(name = "last4")
    private Integer last4;

    @Column(name = "expiration_month")
    private Integer expirationMonth;

    @Column(name = "expiration_year")
    private Integer expirationYear;
}
