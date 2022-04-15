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
@Table(name = "ordersheet")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class ordersheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "AAddress")
    private String AAddress;

    @Column(name = "AHP")
    private String AHP;

    @Column(name = "Applicant")
    private String Applicant;

    @Column(name = "ATell")
    private String ATell;

    @Column(name = "OderSheetCode")
    private String OderSheetCode;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Payer")
    private String Payer;

    @Column(name = "Price")
    private String Price;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "RAdress")
    private String RAdress;

    @Column(name = "Recipent")
    private String Recipent;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Remainder")
    private String Remainder;

    @Column(name = "RHP")
    private String RHP;

    @Column(name = "RTell")
    private String RTell;


    @Builder  // alt insert   맨위에거 누르기
    public ordersheet(Integer ID, String AAddress, String AHP, String Applicant, String ATell, String OderSheetCode,
                  String Description, String Payer, String Price, String ProductCode, Integer Quantity, String RAdress,
                  String Recipent, String WriteDate, String Writer, String Remainder, String RHP, String RTell ) {
        this.ID = ID;
        this.AAddress = AAddress;
        this.AHP = AHP;
        this.Applicant = Applicant;
        this.ATell = ATell;
        this.OderSheetCode = OderSheetCode;
        this.Description = Description;
        this.Payer = Payer;
        this.Price = Price;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.RAdress = RAdress;
        this.Recipent = Recipent;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Remainder = Remainder;
        this.RHP = RHP;
        this.RTell = RTell;

    }
}
