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
@Table(name = "heating")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class heating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Checker")
    private String Checker;

    @Column(name = "Endtime")
    private String Endtime;

    @Column(name = "Improving")
    private String Improving;

    @Column(name = "Kettle")
    private String Kettle;

    @Column(name = "Problem")
    private String Problem;

    @Column(name = "Description")
    private String Description;

    @Column(name = "SauceEndTem")
    private String SauceEndTem;

    @Column(name = "SauceStartTem")
    private String SauceStartTem;

    @Column(name = "StartTime")
    private String StartTime;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public heating(Integer ID, String Checker, String Endtime, String Improving, String Kettle, String Problem,
                  String Description, String SauceEndTem, String SauceStartTem, String StartTime, String Manager,String WriteDate, String Writer) {
        this.ID = ID;
        this.Checker = Checker;
        this.Endtime = Endtime;
        this.Improving = Improving;
        this.Kettle = Kettle;
        this.Problem = Problem;
        this.Description = Description;
        this.SauceEndTem = SauceEndTem;
        this.SauceStartTem = SauceStartTem;
        this.StartTime = StartTime;
        this.Manager = Manager;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
