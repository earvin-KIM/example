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
@Table(name = "rfid_barrel")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rfid_barrel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Barrel")
    private String Barrel;

    @Column(name = "RFID")
    private String RFID;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public rfid_barrel(Integer ID, String Barrel, String RFID, String WriteDate, String Writer) {
        this.ID = ID;
        this.Barrel = Barrel;
        this.RFID = RFID;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
