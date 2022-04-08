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
@Table(name = "equipment")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "EqupmentCode")
    private String EqupmentCode;

    @Column(name = "EquipmentDescription")
    private String EquipmentDescription;

    @Column(name = "EquipmentManagers")
    private String EquipmentManagers;

    @Column(name = "EquipmentManufacture")
    private String EquipmentManufacture;

    @Column(name = "EquipmentName")
    private String EquipmentName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "EquipmentQuantity")
    private Integer EquipmentQuantity;

    @Column(name = "EquipmentSpecifications")
    private String EquipmentSpecifications;

    @Column(name = "MainProducts")
    private String MainProducts;

    @Column(name = "ManufactureDate")
    private String ManufactureDate;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "State")
    private String State;

    @Column(name = "StateChangeDate")
    private String StateChangeDate;

    @Column(name = "UsingDepartmentsEquipment")
    private String UsingDepartmentsEquipment;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public equipment(Integer ID, String EqupmentCode, String EquipmentDescription, String EquipmentManagers, String EquipmentManufacture, String EquipmentName,
                  String Description, Integer EquipmentQuantity, String EquipmentSpecifications, String MainProducts, String ManufactureDate, String ProcessName,
                  String State, String StateChangeDate, String UsingDepartmentsEquipment, String WriteDate, String Writer ) {
        this.ID = ID;
        this.EqupmentCode = EqupmentCode;
        this.EquipmentDescription = EquipmentDescription;
        this.EquipmentManagers = EquipmentManagers;
        this.EquipmentManufacture = EquipmentManufacture;
        this.EquipmentName = EquipmentName;
        this.Description = Description;
        this.EquipmentQuantity = EquipmentQuantity;
        this.EquipmentSpecifications = EquipmentSpecifications;
        this.MainProducts = MainProducts;
        this.ManufactureDate = ManufactureDate;
        this.ProcessName = ProcessName;
        this.State = State;
        this.StateChangeDate = StateChangeDate;
        this.UsingDepartmentsEquipment = UsingDepartmentsEquipment;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
