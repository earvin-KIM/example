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
@Table(name = "shipinspection")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class shipinspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Components")
    private String Components;

    @Column(name = "ForeignBody")
    private String ForeignBody;

    @Column(name = "InspectionTime")
    private String InspectionTime;

    @Column(name = "Lable")
    private String Lable;

    @Column(name = "Packing")
    private String Packing;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Smell")
    private String Smell;


    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public shipinspection(Integer ID, String Components, String ForeignBody, String InspectionTime, String Lable, String Packing,
                      String Description, String Smell,  String ProductCode,String WriteDate, String Writer) {
        this.ID = ID;
        this.Components = Components;
        this.ForeignBody = ForeignBody;
        this.InspectionTime = InspectionTime;
        this.Lable = Lable;
        this.Packing = Packing;
        this.Description = Description;
        this.Smell = Smell;
        this.ProductCode = ProductCode;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
