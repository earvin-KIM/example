package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<equipment,Integer> {
}
