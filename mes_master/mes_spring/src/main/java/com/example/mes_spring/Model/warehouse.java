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
@Table(name = "warehouse")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "WarehouseCode")
    private String WarehouseCode;

    @Column(name = "WarehouseName")
    private String WarehouseName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public warehouse(Integer ID, String WarehouseCode, String WarehouseName, String Description,String WriteDate, String Writer) {
        this.ID = ID;
        this.WarehouseCode = WarehouseCode;
        this.WarehouseName = WarehouseName;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
