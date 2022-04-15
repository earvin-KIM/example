package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.process;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessRepository extends JpaRepository<process,Integer> {
}
