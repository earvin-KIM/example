package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<temperature,Integer> {
}
