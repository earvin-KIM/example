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
@Table(name = "orders")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "DeliveryDueDate")
    private String DeliveryDueDate;

    @Column(name = "OrderDate")
    private String OrderDate;

    @Column(name = "OrderDocNumber")
    private String OrderDocNumber;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "Remainder")
    private Integer Remainder;

    @Column(name = "State")
    private String State;

    @Column(name = "Unit")
    private String Unit;


    @Builder  // alt insert   맨위에거 누르기
    public orders(Integer ID, String DeliveryDueDate, String OrderDate, String OrderDocNumber, String ProductCode, Integer Quantity,
                  Integer Remainder, String State, String Unit) {
        this.ID = ID;
        this.DeliveryDueDate = DeliveryDueDate;
        this.OrderDate = OrderDate;
        this.OrderDocNumber = OrderDocNumber;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.Remainder = Remainder;
        this.State = State;
        this.Unit = Unit;

    }
}
