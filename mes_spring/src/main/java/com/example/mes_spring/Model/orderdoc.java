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
@Table(name = "orderdoc")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class orderdoc {

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

    @Column(name = "MoneyUnit")
    private String MoneyUnit;

    @Column(name = "OrderDate")
    private String OrderDate;

    @Column(name = "OrderDocNumber")
    private String OrderDocNumber;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "State")
    private String State;

    @Column(name = "UnitePrice")
    private Integer UnitePrice;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Workplace")
    private String Workplace;


    @Builder  // alt insert   맨위에거 누르기
    public orderdoc(Integer ID, String ClientCompany, String ConfirmMan, Integer ContactPrice, String DeliveryCondition, Integer ListPrice,
                  String Description, String MoneyUnit, String OrderDate, String OrderDocNumber, String Manager, String State,
                  Integer UnitePrice, String WriteDate, String Writer, String Workplace ) {
        this.ID = ID;
        this.ClientCompany = ClientCompany;
        this.ConfirmMan = ConfirmMan;
        this.ContactPrice = ContactPrice;
        this.DeliveryCondition = DeliveryCondition;
        this.ListPrice = ListPrice;
        this.Description = Description;
        this.MoneyUnit = MoneyUnit;
        this.OrderDate = OrderDate;
        this.OrderDocNumber = OrderDocNumber;
        this.Manager = Manager;
        this.State = State;
        this.UnitePrice = UnitePrice;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Workplace = Workplace;

    }
}
