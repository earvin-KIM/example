package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<department,Integer> {
}
