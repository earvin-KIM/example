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
@Table(name = "equipmentinspection")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class equipmentinspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Broken")
    private String Broken;

    @Column(name = "Controll")
    private String Controll;

    @Column(name = "EquipmentCode")
    private String EquipmentCode;

    @Column(name = "ForeignBody")
    private String ForeignBody;

    @Column(name = "InspectionTime")
    private String InspectionTime;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Power")
    private String Power;

    @Column(name = "Volte")
    private String Volte;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public equipmentinspection(Integer ID, String Broken, String Controll, String EquipmentCode, String ForeignBody, String InspectionTime,
                  String Description, String Power, String Volte,String WriteDate, String Writer) {
        this.ID = ID;
        this.Broken = Broken;
        this.Controll = Controll;
        this.EquipmentCode = EquipmentCode;
        this.ForeignBody = ForeignBody;
        this.InspectionTime = InspectionTime;
        this.Description = Description;
        this.Power = Power;
        this.Volte = Volte;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
