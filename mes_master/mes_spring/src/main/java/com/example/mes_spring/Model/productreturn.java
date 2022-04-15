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
@Table(name = "productreturn")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class productreturn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Client")
    private String Client;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "ProductName")
    private String ProductName;

    @Column(name = "Result")
    private String Result;

    @Column(name = "ReturnDate")
    private String ReturnDate;

    @Column(name = "Description")
    private String Description;

    @Column(name = "ReturnReason")
    private String ReturnReason;

    @Column(name = "ShipOrderDoNumber")
    private String ShipOrderDoNumber;

    @Column(name = "Quantity")
    private String Quantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public productreturn(Integer ID, String Client, String Manager, String ProductName, String Result, String ReturnDate,
                      String Description, String ReturnReason, String ShipOrderDoNumber,  String Quantity, String WriteDate, String Writer) {
        this.ID = ID;
        this.Client = Client;
        this.Manager = Manager;
        this.ProductName = ProductName;
        this.Result = Result;
        this.ReturnDate = ReturnDate;
        this.Description = Description;
        this.ReturnReason = ReturnReason;
        this.ShipOrderDoNumber = ShipOrderDoNumber;
        this.Quantity = Quantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
