package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<inventory,Integer> {
}
