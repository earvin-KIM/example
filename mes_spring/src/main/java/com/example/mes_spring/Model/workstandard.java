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
@Table(name = "workstandard")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class workstandard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Document")
    private String Document;

    @Column(name = "Precautions")
    private String Precautions;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "TestCycle")
    private String TestCycle;

    @Column(name = "Treatment")
    private String Treatment;

    @Column(name = "WorkCode")
    private String WorkCode;

    @Column(name = "WorkContents")
    private String WorkContents;

    @Column(name = "WorkName")
    private String WorkName;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public workstandard(Integer ID, String Document, String Precautions, String ProcessName, String TestCycle, String Treatment,
                      String WorkCode, String WorkContents, String WorkName, String WriteDate, String Writer) {
        this.ID = ID;
        this.Document = Document;
        this.Precautions = Precautions;
        this.ProcessName = ProcessName;
        this.TestCycle = TestCycle;
        this.Treatment = Treatment;
        this.WorkCode = WorkCode;
        this.WorkContents = WorkContents;
        this.WorkName = WorkName;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
