package com.partner.PartnerOrdersHub.service;

import com.partner.PartnerOrdersHub.entity.Card;

import java.util.List;

public interface CardService {

    public Card cardDetails(long id);

    public Card activateCard(long id);

    public Card replaceCard(long id);

    public List<Card> getCards();

}
