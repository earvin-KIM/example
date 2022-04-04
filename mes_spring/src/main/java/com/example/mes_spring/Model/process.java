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
@Table(name = "process")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class process {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Document")
    private String Document;

    @Column(name = "EquipmentCode")
    private String EquipmentCode;

    @Column(name = "FinalProcess")
    private String FinalProcess;

    @Column(name = "GuideDocument")
    private String GuideDocument;

    @Column(name = "InspectionName")
    private String InspectionName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "OutputHour")
    private Integer OutputHour;

    @Column(name = "OutputMinute")
    private Integer OutputMinute;

    @Column(name = "ProcessCode")
    private String ProcessCode;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "ProductionUnit")
    private String ProductionUnit;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "SortName")
    private String SortName;

    @Column(name = "Warehouse")
    private String Warehouse;



    @Builder  // alt insert   맨위에거 누르기
    public process(Integer ID, String Document, String EquipmentCode, String FinalProcess, String GuideDocument, String InspectionName,
                      String Description, String Manager, Integer OutputHour, Integer OutputMinute, String ProcessCode, String ProcessName,
                      String ProductionUnit, String WriteDate, String Writer, String SortName, String Warehouse ) {
        this.ID = ID;
        this.Document = Document;
        this.EquipmentCode = EquipmentCode;
        this.FinalProcess = FinalProcess;
        this.GuideDocument = GuideDocument;
        this.InspectionName = InspectionName;
        this.Description = Description;
        this.Manager = Manager;
        this.OutputHour = OutputHour;
        this.OutputMinute = OutputMinute;
        this.ProcessCode = ProcessCode;
        this.ProcessName = ProcessName;
        this.ProductionUnit = ProductionUnit;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.SortName = SortName;
        this.Warehouse = Warehouse;


    }
}
