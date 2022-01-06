package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "board")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class Boards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;

    @Column(name = "_head")
    private String _head;

    @Column(name = "img_path")
    private String img_path;

    @Column(name = "rownum")
    private Integer rownum;

    @Column(name = "paragraph")
    private String paragraph;


    @Builder  // alt insert   맨위에거 누르기
    public Boards(Integer _id, String _head, String img_path, Integer rownum, String paragraph ) {
        this._id = _id;
        this._head = _head;
        this.img_path = img_path;
        this.rownum = rownum;
        this.paragraph = paragraph;

    }
}