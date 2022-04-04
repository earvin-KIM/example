package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<worker,Integer> {
}
