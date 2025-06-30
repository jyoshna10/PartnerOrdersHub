package com.partner.PartnerOrdersHub.rest;

import com.partner.PartnerOrdersHub.entity.Card;
import com.partner.PartnerOrdersHub.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardsController {

    @Autowired
    public CardService cardService;

    @GetMapping()
    public ResponseEntity<List<Card>> cards(){
        List<Card> cards = cardService.getCards();
        return ResponseEntity.ok(cards);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<Card> cardDetails(@PathVariable long id) {
        return ResponseEntity.ok(cardService.cardDetails(id));
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<Card> activateCard(@PathVariable long id){
        return ResponseEntity.ok(cardService.activateCard(id));
    }

    @PostMapping("/{id}/replaceCard")
    public ResponseEntity<Card> replaceCard(@PathVariable long id) {

        return ResponseEntity.ok(cardService.replaceCard(id));
    }
}
