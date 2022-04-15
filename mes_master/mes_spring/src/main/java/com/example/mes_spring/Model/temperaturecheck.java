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
@Table(name = "temperaturecheck")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class temperaturecheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Checker")
    private String Checker;

    @Column(name = "CheckTime")
    private String CheckTime;

    @Column(name = "Improving")
    private String Improving;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "MaterialFreezer")
    private Double MaterialFreezer;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Problem")
    private String Problem;

    @Column(name = "RawFreezer")
    private Double RawFreezer;

    @Column(name = "RipeningRoom")
    private Double RipeningRoom;

    @Column(name = "ThawRoom")
    private Double ThawRoom;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public temperaturecheck(Integer ID, String Checker, String CheckTime, String Improving, String Manager, Double MaterialFreezer,
                      String Description, String Problem, Double RawFreezer, Double RipeningRoom, Double ThawRoom, String WriteDate, String Writer) {
        this.ID = ID;
        this.Checker = Checker;
        this.CheckTime = CheckTime;
        this.Improving = Improving;
        this.Manager = Manager;
        this.MaterialFreezer = MaterialFreezer;
        this.Description = Description;
        this.Problem = Problem;
        this.RawFreezer = RawFreezer;
        this.RipeningRoom = RipeningRoom;
        this.ThawRoom = ThawRoom;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
