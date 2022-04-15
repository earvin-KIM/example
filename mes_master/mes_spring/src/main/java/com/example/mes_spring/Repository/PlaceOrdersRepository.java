package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.placeorders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceOrdersRepository extends JpaRepository<placeorders,Integer> {
}
