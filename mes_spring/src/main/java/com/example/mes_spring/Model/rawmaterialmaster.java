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
@Table(name = "rawmaterialmaster")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rawmaterialmaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ClientCompany")
    private String ClientCompany;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "MaterialName")
    private String MaterialName;

    @Column(name = "Origin")
    private String Origin;

    @Column(name = "QuantitiyUnit")
    private String QuantitiyUnit;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Reverse")
    private Integer Reverse;

    @Column(name = "Sortation")
    private String Sortation;

    @Column(name = "Storage")
    private String Storage;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "StorageTerm")
    private String StorageTerm;

    @Column(name = "Temperature")
    private String Temperature;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Unit")
    private String Unit;

    @Column(name = "UnitPrice")
    private String UnitPrice;

    @Column(name = "Weight")
    private String Weight;


    @Builder  // alt insert   맨위에거 누르기
    public rawmaterialmaster(Integer ID, String ClientCompany, String MaterialCode, String MaterialName, String Origin, String QuantitiyUnit,
                      String Description, Integer Reverse, String Sortation, String Storage, Integer Quantity, String StorageTerm,
                      String Temperature, String WriteDate, String Writer, String Unit, String UnitPrice, String Weight ) {
        this.ID = ID;
        this.ClientCompany = ClientCompany;
        this.MaterialCode = MaterialCode;
        this.MaterialName = MaterialName;
        this.Origin = Origin;
        this.QuantitiyUnit = QuantitiyUnit;
        this.Description = Description;
        this.Reverse = Reverse;
        this.Sortation = Sortation;
        this.Storage = Storage;
        this.Quantity = Quantity;
        this.StorageTerm = StorageTerm;
        this.Temperature = Temperature;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Unit = Unit;
        this.UnitPrice = UnitPrice;
        this.Weight = Weight;

    }
}
