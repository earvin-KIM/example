package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.ordersheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderSheetRepository extends JpaRepository<ordersheet,Integer> {
}
