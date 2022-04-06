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
@Table(name = "bom")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class bom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Bomcode")
    private String Bomcode;

    @Column(name = "BomName")
    private String BomName;

    @Column(name = "MaterialBom")
    private String MaterialBom;

    @Column(name = "MiddleMaterial")
    private String MiddleMaterial;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Quantity")
    private String Quantity;

    @Column(name = "RawPlus")
    private String RawPlus;

    @Column(name = "SortCode")
    private String SortCode;

    @Column(name = "Unit")
    private String Unit;


    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public bom(Integer ID, String Bomcode, String BomName, String MaterialBom, String MiddleMaterial, String ProductCode,
                  String Description, String Quantity, String RawPlus, String SortCode, String Unit,String WriteDate, String Writer) {
        this.ID = ID;
        this.Bomcode = Bomcode;
        this.BomName = BomName;
        this.MaterialBom = MaterialBom;
        this.MiddleMaterial = MiddleMaterial;
        this.ProductCode = ProductCode;
        this.Description = Description;
        this.Quantity = Quantity;
        this.RawPlus = RawPlus;
        this.SortCode = SortCode;
        this.Unit = Unit;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
