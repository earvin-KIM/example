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
@Table(name = "barcode")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class barcode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Barcode")
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
