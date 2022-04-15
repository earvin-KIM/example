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
@Table(name = "equipmentchecklist")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class equipmentchecklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "EquipmentCode")
    private String EquipmentCode;

    @Column(name = "InspectionName")
    private String InspectionName;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public equipmentchecklist(Integer ID, String EquipmentCode, String InspectionName,
                              String WriteDate, String Writer) {
        this.ID = ID;
        this.EquipmentCode = EquipmentCode;
        this.InspectionName = InspectionName;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
