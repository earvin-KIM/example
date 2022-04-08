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
@Table(name = "product")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Bundle")
    private String Bundle;

    @Column(name = "IcePack")
    private String IcePack;

    @Column(name = "Packing")
    private String Packing;

    @Column(name = "Shipping")
    private String Shipping;

    @Column(name = "SortName")
    private String SortName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Storage")
    private String Storage;

    @Column(name = "Price")
    private String Price;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "StorageTerm")
    private String StorageTerm;

    @Column(name = "Unit")
    private String Unit;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "UnitPrice")
    private String UnitPrice;


    @Builder  // alt insert   맨위에거 누르기
    public product(Integer ID, String Bundle, String IcePack, String Packing, String Shipping, String SortName,
                      String Description, String Storage, String Price, String ProductCode, Integer Quantity, String StorageTerm,
                      String Unit, String WriteDate, String Writer, String UnitPrice) {
        this.ID = ID;
        this.Bundle = Bundle;
        this.IcePack = IcePack;
        this.Packing = Packing;
        this.Shipping = Shipping;
        this.SortName = SortName;
        this.Description = Description;
        this.Storage = Storage;
        this.Price = Price;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.StorageTerm = StorageTerm;
        this.Unit = Unit;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.UnitPrice = UnitPrice;


    }
}
