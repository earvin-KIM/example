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
@Table(name = "filter")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Checker")
    private String Checker;

    @Column(name = "Filtering")
    private String Filtering;

    @Column(name = "Improving")
    private String Improving;

    @Column(name = "InspectionTime")
    private String InspectionTime;

    @Column(name = "Matter")
    private String Matter;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Problem")
    private String Problem;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public filter(Integer ID, String Checker, String Filtering, String Improving, String InspectionTime, String Matter,
                  String Description, String Problem, String ProductCode, String Manager,String WriteDate, String Writer) {
        this.ID = ID;
        this.Checker = Checker;
        this.Filtering = Filtering;
        this.Improving = Improving;
        this.InspectionTime = InspectionTime;
        this.Matter = Matter;
        this.Description = Description;
        this.Problem = Problem;
        this.ProductCode = ProductCode;
        this.Manager = Manager;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
