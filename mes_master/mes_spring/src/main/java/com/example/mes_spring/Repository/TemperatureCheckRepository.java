package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.temperaturecheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureCheckRepository extends JpaRepository<temperaturecheck,Integer> {
}
