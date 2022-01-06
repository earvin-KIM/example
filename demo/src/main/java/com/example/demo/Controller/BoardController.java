package com.example.demo.Controller;

import com.example.demo.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {
    @Autowired
    private BoardService boardsService;

    // 모든 게시글 부름
    @GetMapping("/board")
    public List getAllBoards() {
        return boardsService.getAllBoard();
    }
    // 글 작성
//    @PostMapping("/board")
//    public Board createBoard(@RequestBody Req_Board req_board){
//        return boardService.createBoard(req_board);
//    }
}