package com.example.mes_spring.Controller;

import com.example.mes_spring.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MesController {
    @Autowired
    private BarcodeRepository barcodeRepository;
    @Autowired
    private BomRepository bomRepository;

    // 모든 게시글 부름
    @GetMapping("/board")
    public List getBoard() {
        return barcodeRepository.findAll();
    }
    @GetMapping("/board1")
    public List getBoard1() {
        return bomRepository.findAll();
    }
}
