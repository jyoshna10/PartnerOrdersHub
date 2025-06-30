package com.partner.PartnerOrdersHub.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="cards")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long number;

    private String status;

    private boolean isActive;



}
