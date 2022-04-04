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
@Table(name = "shiporderdoc")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class shiporderdoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "BarCode")
    private String BarCode;

    @Column(name = "Carryover")
    private String Carryover;

    @Column(name = "ClientCompany")
    private String ClientCompany;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "OrderNumber")
    private String OrderNumber;

    @Column(name = "Description")
    private String Description;

    @Column(name = "RealRetention")
    private String RealRetention;

    @Column(name = "ShipOrderDate")
    private String ShipOrderDate;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "ShippingDate")
    private String ShippingDate;

    @Column(name = "ShipOrderDocNumber")
    private String ShipOrderDocNumber;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "ShippingQuantity")
    private Integer ShippingQuantity;

    @Column(name = "ShipRemainder")
    private Integer ShipRemainder;

    @Column(name = "State")
    private String State;


    @Builder  // alt insert   맨위에거 누르기
    public shiporderdoc(Integer ID, String BarCode, String Carryover, String ClientCompany, String Manager, String OrderNumber,
                      String Description, String RealRetention, String ShipOrderDate, String ProductCode, Integer Quantity, String ShippingDate,
                      String ShipOrderDocNumber, String WriteDate, String Writer, Integer ShippingQuantity, Integer ShipRemainder, String State ) {
        this.ID = ID;
        this.BarCode = BarCode;
        this.Carryover = Carryover;
        this.ClientCompany = ClientCompany;
        this.Manager = Manager;
        this.OrderNumber = OrderNumber;
        this.Description = Description;
        this.RealRetention = RealRetention;
        this.ShipOrderDate = ShipOrderDate;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.ShippingDate = ShippingDate;
        this.ShipOrderDocNumber = ShipOrderDocNumber;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.ShippingQuantity = ShippingQuantity;
        this.ShipRemainder = ShipRemainder;
        this.State = State;

    }
}
