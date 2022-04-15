package com.example.mes_spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mes_spring.Model.barcode;
public interface BarcodeRepository extends JpaRepository<barcode,Integer> {//현재 레포지터리를 Jpa 레포지터리의 확장으로 선언, Jpa 레포지터리 기능을 사용 가능하게 해줌.
}
