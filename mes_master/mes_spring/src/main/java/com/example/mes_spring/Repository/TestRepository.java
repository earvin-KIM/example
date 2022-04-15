package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.Test;
import com.example.mes_spring.Model.bom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Integer> {
}
