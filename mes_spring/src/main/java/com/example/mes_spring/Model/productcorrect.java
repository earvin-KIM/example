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
@Table(name = "productcorrect")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class productcorrect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ChangeQuantity")
    private String ChangeQuantity;

    @Column(name = "Reason")
    private String Reason;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public productcorrect(Integer ID, String ChangeQuantity, String Reason,  String ProductCode, Integer Quantity,String WriteDate, String Writer ) {
        this.ID = ID;
        this.ChangeQuantity = ChangeQuantity;
        this.Reason = Reason;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
