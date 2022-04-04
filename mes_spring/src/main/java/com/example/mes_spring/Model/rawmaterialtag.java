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
@Table(name = "rawmaterialtag")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rawmaterialtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "PlaceOrderNumber")
    private String PlaceOrderNumber;

    @Column(name = "PlaceQuantity")
    private Integer PlaceQuantity;

    @Column(name = "RawMaterialLOT")
    private String RawMaterialLOT;

    @Column(name = "State")
    private String State;

    @Column(name = "TagNumber")
    private String TagNumber;


    @Column(name = "Quantity")
    private Integer Quantity;


    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Remainder")
    private Integer Remainder;



    @Builder  // alt insert   맨위에거 누르기
    public rawmaterialtag(Integer ID, String MaterialCode, String PlaceOrderNumber, Integer PlaceQuantity, String RawMaterialLOT, String State,
                      String TagNumber, Integer Quantity,String WriteDate, String Writer, Integer Remainder) {
        this.ID = ID;
        this.MaterialCode = MaterialCode;
        this.PlaceOrderNumber = PlaceOrderNumber;
        this.PlaceQuantity = PlaceQuantity;
        this.RawMaterialLOT = RawMaterialLOT;
        this.State = State;
        this.TagNumber = TagNumber;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Remainder = Remainder;

    }
}
