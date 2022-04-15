package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.loginlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginLogRepository extends JpaRepository<loginlog,Integer> {
}
