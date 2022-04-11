package com.example.mes_spring.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Test")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "unit")
    private String unit;

    @Column(name = "number")
    private String number;

    @Column(name = "weight")
    private String weight;

    @Column(name = "writeDate")
    private String writeDate;
    public Test(){

    }

    @Builder  // alt insert   맨위에거 누르기
    public Test(Integer ID, String unit, String weight, String writeDate, String number  ) {
        this.ID = ID;
        this.unit = unit;
        this.weight = weight;
        this.writeDate = writeDate;
        this.number = number;

    }
}
