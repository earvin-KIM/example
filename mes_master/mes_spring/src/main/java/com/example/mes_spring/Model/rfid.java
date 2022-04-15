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
@Table(name = "rfid")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rfid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "DeviceNum")
    private String DeviceNum;

    @Column(name = "Place")
    private String Place;

    @Column(name = "Port")
    private String Port;

    @Column(name = "RFID")
    private String RFID;

    @Column(name = "WriteDate")
    private String WriteDate;



    @Builder  // alt insert   맨위에거 누르기
    public rfid(Integer ID, String DeviceNum, String Place, String Port, String RFID,String WriteDate ) {
        this.ID = ID;
        this.DeviceNum = DeviceNum;
        this.Place = Place;
        this.Port = Port;
        this.RFID = RFID;
        this.WriteDate = WriteDate;
    }
}
