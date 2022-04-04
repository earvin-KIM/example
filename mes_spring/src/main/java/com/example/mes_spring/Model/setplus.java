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
@Table(name = "setplus")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class setplus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "SetProduct")
    private String SetProduct;

    @Column(name = "SetQuantity")
    private String SetQuantity;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public setplus(Integer ID, String SetProduct, String SetQuantity, String ProductCode, Integer Quantity, String WriteDate, String Writer) {
        this.ID = ID;
        this.SetProduct = SetProduct;
        this.SetQuantity = SetQuantity;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
