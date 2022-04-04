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
@Table(name = "weight_rec")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class weight_rec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Unit")
    private String Unit;

    @Column(name = "number")
    private String number;

    @Column(name = "Weight")
    private String Weight;

    @Column(name = "WriteDate")
    private String WriteDate;


    @Builder  // alt insert   맨위에거 누르기
    public weight_rec(Integer ID, String Unit, String Weight, String WriteDate, String number  ) {
        this.ID = ID;
        this.Unit = Unit;
        this.Weight = Weight;
        this.WriteDate = WriteDate;
        this.number = number;

    }
}
