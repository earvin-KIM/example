package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.rfid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RFIDRepository extends JpaRepository<rfid,Integer> {
}
