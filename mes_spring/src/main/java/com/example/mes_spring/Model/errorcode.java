package com.example.mes_spring.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "errorcode")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class errorcode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ErrorCode")
    private String ErrorCode;

    @Column(name = "ErrorContents")
    private String ErrorContents;

    @Column(name = "ErrorName")
    private String ErrorName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public errorcode(Integer ID, String ErrorCode, String ErrorContents, String ErrorName,
                  String Description,String WriteDate, String Writer) {
        this.ID = ID;
        this.ErrorCode = ErrorCode;
        this.ErrorContents = ErrorContents;
        this.ErrorName = ErrorName;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;


    }
}
