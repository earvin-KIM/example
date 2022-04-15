package com.example.mes_spring.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor//lombok 어노테이션
@Getter//lombok 어노테이션 자동으로 get함수 만들어줌
@Setter//lombok 어노테이션 자동으로 set함수 만들어줌
@Entity
@Table(name = "barcode")
@DynamicInsert  // insert 시 null 인 필드 제외하기위해 사용
@DynamicUpdate // update 시 null 인 필드 제외하기위해 사용
public class barcode {

    @Id//id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Barcode")//column 일일히 선언해줌
    private String Barcode;

    @Column(name = "Device")
    private String Device;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "ProductName")
    private String ProductName;

    @Column(name = "WriteDate")
    private String WriteDate;



    @Builder  // alt insert   맨위에거 누르기
    public barcode(Integer ID, String Barcode, String Device, String ProductCode, String ProductName, String WriteDate) {
        this.ID = ID;
        this.Barcode = Barcode;
        this.Device = Device;
        this.ProductCode = ProductCode;
        this.ProductName = ProductName;
        this.WriteDate = WriteDate;

    }
}
