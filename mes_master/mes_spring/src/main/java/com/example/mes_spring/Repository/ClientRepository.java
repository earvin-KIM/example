package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<client,Integer> {
}
