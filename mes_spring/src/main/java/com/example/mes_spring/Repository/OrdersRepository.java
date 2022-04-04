package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<orders,Integer> {
}
