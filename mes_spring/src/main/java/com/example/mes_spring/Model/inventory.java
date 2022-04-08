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
@Table(name = "inventory")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Carryover")
    private String Carryover;

    @Column(name = "InventoryLOT")
    private String InventoryLOT;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "PackBarrel")
    private Integer PackBarrel;

    @Column(name = "Process")
    private String Process;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private String Quantity;

    @Column(name = "RawMaterialLOT")
    private String RawMaterialLOT;

    @Column(name = "Remainder")
    private String Remainder;

    @Column(name = "ShipOrderDocNumber")
    private String ShipOrderDocNumber;

    @Column(name = "TagForm")
    private String TagForm;

    @Column(name = "TagTo")
    private String TagTo;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "WorkOderDocNumber")
    private String WorkOderDocNumber;


    @Builder  // alt insert   맨위에거 누르기
    public inventory(Integer ID, String Carryover, String InventoryLOT, String MaterialCode, Integer PackBarrel, String Process,
                  String ProductCode, String Quantity, String RawMaterialLOT, String Remainder, String ShipOrderDocNumber, String TagForm,
                  String TagTo, String WriteDate, String Writer, String WorkOderDocNumber ) {
        this.ID = ID;
        this.Carryover = Carryover;
        this.InventoryLOT = InventoryLOT;
        this.MaterialCode = MaterialCode;
        this.PackBarrel = PackBarrel;
        this.Process = Process;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.RawMaterialLOT = RawMaterialLOT;
        this.Remainder = Remainder;
        this.ShipOrderDocNumber = ShipOrderDocNumber;
        this.TagForm = TagForm;
        this.TagTo = TagTo;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.WorkOderDocNumber = WorkOderDocNumber;

    }
}
