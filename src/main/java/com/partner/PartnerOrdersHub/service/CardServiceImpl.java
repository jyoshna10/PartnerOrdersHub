package com.partner.PartnerOrdersHub.service;

import com.partner.PartnerOrdersHub.DAO.CardRepository;
import com.partner.PartnerOrdersHub.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    private CardRepository cardRepository;

    public List<Card> getCards() {
        return cardRepository.findAll();

    }
    public Card cardDetails(long id) {
        Optional<Card> result = cardRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public Card activateCard(long id) {

        Card card = cardRepository.findById(id).orElseThrow();
        card.setStatus("Activated");
        card.setActive(true);

        cardRepository.save(card);

        return card;
    }

    @Override
    public Card replaceCard(long id) {

        Card card = cardRepository.findById(id).orElseThrow();
        card.setStatus("Replaced");
        card.setActive(false);

        cardRepository.save(card);

        return null;
    }


}
