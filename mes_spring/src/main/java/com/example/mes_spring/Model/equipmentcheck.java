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
@Table(name = "equipmentcheck")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class equipmentcheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Cleanness")
    private String Cleanness;

    @Column(name = "ControlPart")
    private String ControlPart;

    @Column(name = "Damage")
    private String Damage;

    @Column(name = "EquipmentCode")
    private String EquipmentCode;

    @Column(name = "Power")
    private String Power;

    @Column(name = "Screw")
    private String Screw;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public equipmentcheck(Integer ID, String Cleanness, String ControlPart, String Damage, String EquipmentCode, String Power,
                  String Screw,String WriteDate, String Writer ) {
        this.ID = ID;
        this.Cleanness = Cleanness;
        this.ControlPart = ControlPart;
        this.Damage = Damage;
        this.EquipmentCode = EquipmentCode;
        this.Power = Power;
        this.Screw = Screw;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
