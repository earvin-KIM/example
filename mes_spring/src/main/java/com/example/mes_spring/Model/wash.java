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
@Table(name = "wash")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class wash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Checker")
    private String Checker;

    @Column(name = "CleaningMethod")
    private String CleaningMethod;

    @Column(name = "Improving")
    private String Improving;

    @Column(name = "InputWater")
    private String InputWater;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Problem")
    private String Problem;

    @Column(name = "WashTime")
    private String WashTime;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Water")
    private String Water;

    @Column(name = "WaterChange")
    private String WaterChange;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public wash(Integer ID, String Checker, String CleaningMethod, String Improving, String InputWater, String Manager,
                      String Description, String Problem, String WashTime, String ProductCode, String Water, String WaterChange,
                      String WriteDate, String Writer) {
        this.ID = ID;
        this.Checker = Checker;
        this.CleaningMethod = CleaningMethod;
        this.Improving = Improving;
        this.InputWater = InputWater;
        this.Manager = Manager;
        this.Description = Description;
        this.Problem = Problem;
        this.WashTime = WashTime;
        this.ProductCode = ProductCode;
        this.Water = Water;
        this.WaterChange = WaterChange;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
    }
}
