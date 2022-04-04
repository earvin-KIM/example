package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<position,Integer> {
}
