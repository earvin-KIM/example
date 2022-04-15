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
@Table(name = "placeorderdoc")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class placeorderdoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ClientCompany")
    private String ClientCompany;

    @Column(name = "ConfirmMan")
    private String ConfirmMan;

    @Column(name = "ContactPrice")
    private Integer ContactPrice;

    @Column(name = "DeliveryCondition")
    private String DeliveryCondition;

    @Column(name = "ListPrice")
    private Integer ListPrice;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "MoneyUnit")
    private String MoneyUnit;

    @Column(name = "Workplace")
    private String Workplace;

    @Column(name = "PlaceOderDate")
    private String PlaceOderDate;

    @Column(name = "PlaceOrderDoNumber")
    private String PlaceOrderDoNumber;

    @Column(name = "PlaceOrderNumber")
    private String PlaceOrderNumber;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "State")
    private String State;

    @Column(name = "UnitPrice")
    private Integer UnitPrice;



    @Builder  // alt insert   맨위에거 누르기
    public placeorderdoc(Integer ID, String ClientCompany, String ConfirmMan, Integer ContactPrice, String DeliveryCondition, Integer ListPrice,
                      String Description, String Manager, String MoneyUnit, String Workplace, String PlaceOderDate, String PlaceOrderDoNumber,
                      String PlaceOrderNumber, String WriteDate, String Writer, String State, Integer UnitPrice) {
        this.ID = ID;
        this.ClientCompany = ClientCompany;
        this.ConfirmMan = ConfirmMan;
        this.ContactPrice = ContactPrice;
        this.DeliveryCondition = DeliveryCondition;
        this.ListPrice = ListPrice;
        this.Description = Description;
        this.Manager = Manager;
        this.MoneyUnit = MoneyUnit;
        this.Workplace = Workplace;
        this.PlaceOderDate = PlaceOderDate;
        this.PlaceOrderDoNumber = PlaceOrderDoNumber;
        this.PlaceOrderNumber = PlaceOrderNumber;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.State = State;
        this.UnitPrice = UnitPrice;


    }
}
