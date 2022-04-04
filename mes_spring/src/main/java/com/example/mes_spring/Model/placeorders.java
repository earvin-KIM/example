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
@Table(name = "placeorders")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class placeorders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "PlaceOrderDate")
    private String PlaceOrderDate;

    @Column(name = "PlaceOrderDoNumber")
    private String PlaceOrderDoNumber;

    @Column(name = "PlaceOrderNumber")
    private String PlaceOrderNumber;

    @Column(name = "ReceiveDueDate")
    private String ReceiveDueDate;

    @Column(name = "State")
    private String State;

    @Column(name = "Storage")
    private String Storage;

    @Column(name = "Unit")
    private String Unit;

    @Column(name = "Warehouse")
    private String Warehouse;

    @Column(name = "Weight")
    private String Weight;

    @Column(name = "Remainder")
    private Integer Remainder;

    @Column(name = "Quantity")
    private Integer Quantity;


    @Builder  // alt insert   맨위에거 누르기
    public placeorders(Integer ID, String MaterialCode, String PlaceOrderDate, String PlaceOrderDoNumber, String PlaceOrderNumber, String ReceiveDueDate,
                      String State, String Storage, String Unit, String Warehouse, String Weight, Integer Remainder,Integer Quantity) {
        this.ID = ID;
        this.MaterialCode = MaterialCode;
        this.PlaceOrderDate = PlaceOrderDate;
        this.PlaceOrderDoNumber = PlaceOrderDoNumber;
        this.PlaceOrderNumber = PlaceOrderNumber;
        this.ReceiveDueDate = ReceiveDueDate;
        this.State = State;
        this.Storage = Storage;
        this.Unit = Unit;
        this.Warehouse = Warehouse;
        this.Weight = Weight;
        this.Remainder = Remainder;
        this.Quantity = Quantity;


    }
}
