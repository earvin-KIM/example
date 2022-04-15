package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Integer> {
}
