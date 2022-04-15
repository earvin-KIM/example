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
@Table(name = "position")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "NamePosition")
    private String NamePosition;

    @Column(name = "PositionCode")
    private String PositionCode;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public position(Integer ID, String NamePosition, String PositionCode,
                      String Description,String WriteDate, String Writer) {
        this.ID = ID;
        this.NamePosition = NamePosition;
        this.PositionCode = PositionCode;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
