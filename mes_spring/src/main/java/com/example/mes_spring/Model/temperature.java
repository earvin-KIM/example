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
@Table(name = "temperature")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ChName")
    private String ChName;

    @Column(name = "Temperature")
    private String Temperature;

    @Column(name = "WriteDate")
    private String WriteDate;



    @Builder  // alt insert   맨위에거 누르기
    public temperature(Integer ID, String ChName, String Temperature,String WriteDate) {
        this.ID = ID;
        this.ChName = ChName;
        this.Temperature = Temperature;
        this.WriteDate = WriteDate;

    }
}
