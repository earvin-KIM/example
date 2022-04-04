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
@Table(name = "productmove")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class productmove {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "CangeID")
    private String CangeID;

    @Column(name = "ErrorCode")
    private String ErrorCode;

    @Column(name = "MetarialCode")
    private String MetarialCode;

    @Column(name = "O_Quantity")
    private Integer O_Quantity;

    @Column(name = "PlaceOrderNumber")
    private String PlaceOrderNumber;

    @Column(name = "TagFrom")
    private String TagFrom;

    @Column(name = "TagTo")
    private String TagTo;

    @Column(name = "WorkOrderDocNumber")
    private String WorkOrderDocNumber;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public productmove(Integer ID, String CangeID, String ErrorCode, String MetarialCode, Integer O_Quantity, String PlaceOrderNumber,
                      String TagFrom, String TagTo, String WorkOrderDocNumber, String ProductCode, Integer Quantity,String WriteDate, String Writer) {
        this.ID = ID;
        this.CangeID = CangeID;
        this.ErrorCode = ErrorCode;
        this.MetarialCode = MetarialCode;
        this.O_Quantity = O_Quantity;
        this.PlaceOrderNumber = PlaceOrderNumber;
        this.TagFrom = TagFrom;
        this.TagTo = TagTo;
        this.WorkOrderDocNumber = WorkOrderDocNumber;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
