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
@Table(name = "processchart")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class processchart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "BOMCode")
    private String BOMCode;

    @Column(name = "GuideDocument")
    private String GuideDocument;

    @Column(name = "ProcessChartCode")
    private String ProcessChartCode;

    @Column(name = "ProcessCode")
    private String ProcessCode;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "SortCode")
    private String SortCode;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public processchart(Integer ID, String BOMCode, String GuideDocument, String ProcessChartCode, String ATell, String ProcessName,
                      String SortCode, String WriteDate, String Writer) {
        this.ID = ID;
        this.BOMCode = BOMCode;
        this.GuideDocument = GuideDocument;
        this.ProcessChartCode = ProcessChartCode;
        this.ProcessCode = ProcessCode;
        this.ProcessName = ProcessName;
        this.SortCode = SortCode;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
