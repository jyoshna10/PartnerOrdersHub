package com.partner.PartnerOrdersHub.DAO;

import com.partner.PartnerOrdersHub.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
