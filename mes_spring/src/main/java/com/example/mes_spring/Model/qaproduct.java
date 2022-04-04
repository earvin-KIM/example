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
@Table(name = "qaproduct")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class qaproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Client")
    private String Client;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "QACode")
    private String QACode;

    @Column(name = "Description")
    private String Description;

    @Column(name = "ProductCode")
    private String ProductCode;


    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public qaproduct(Integer ID, String Client, String Manager, String QACode,
                      String Description,String ProductCode, String WriteDate, String Writer) {
        this.ID = ID;
        this.Client = Client;
        this.Manager = Manager;
        this.QACode = QACode;
        this.Description = Description;
        this.ProductCode = ProductCode;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
    }
}
