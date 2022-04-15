package com.example.mes_spring.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rawmaterial")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rawmaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Carryover")
    private String Carryover;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "PlaceOrderNumber")
    private String PlaceOrderNumber;

    @Column(name = "RawMaterialLOT")
    private String RawMaterialLOT;

    @Column(name = "TagFrom")
    private String TagFrom;

    @Column(name = "TagTo")
    private String TagTo;

    @Column(name = "Quantity")
    private Integer Quantity;


    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Remainder")
    private Integer Remainder;



    @Builder  // alt insert   맨위에거 누르기
    public rawmaterial(Integer ID, String Carryover, String MaterialCode, String PlaceOrderNumber, String RawMaterialLOT, String TagFrom,
                      String TagTo, Integer Quantity,String WriteDate, String Writer, Integer Remainder) {
        this.ID = ID;
        this.Carryover = Carryover;
        this.MaterialCode = MaterialCode;
        this.PlaceOrderNumber = PlaceOrderNumber;
        this.RawMaterialLOT = RawMaterialLOT;
        this.TagFrom = TagFrom;
        this.TagTo = TagTo;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Remainder = Remainder;

    }
}
