package com.example.mes_spring.Repository;

import com.example.mes_spring.Model.noticeboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeBoardRepository extends JpaRepository<noticeboard,Integer> {
}
