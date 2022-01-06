package com.example.demo.service;

import com.example.demo.model.Boards;
import com.example.demo.repository.BoardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor //bean 주입
@Service
public class BoardService {
    private final BoardsRepository boardsRepository;

    public List<Boards> getAllBoard() {
        return boardsRepository.findAll();
    }

//    @Transactional //메소드 실행시 트랜잭션 시작~ 정상종료되면 커밋/ 에러시 롤백
//    public Integer save(Boards)
}
