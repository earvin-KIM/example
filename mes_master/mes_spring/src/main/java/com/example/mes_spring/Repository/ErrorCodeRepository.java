package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.errorcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorCodeRepository extends JpaRepository<errorcode,Integer> {
}
