package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product,Integer> {
}
