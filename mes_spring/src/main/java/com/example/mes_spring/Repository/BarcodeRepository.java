package com.example.mes_spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mes_spring.Model.barcode;
public interface BarcodeRepository extends JpaRepository<barcode,Integer> {
}
