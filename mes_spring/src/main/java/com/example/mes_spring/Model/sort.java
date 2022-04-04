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
@Table(name = "sort")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class sort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "BigSort")
    private String BigSort;

    @Column(name = "SortCode")
    private String SortCode;

    @Column(name = "SortName")
    private String SortName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public sort(Integer ID, String BigSort, String SortCode, String SortName,
                      String Description,String WriteDate, String Writer) {
        this.ID = ID;
        this.BigSort = BigSort;
        this.SortCode = SortCode;
        this.SortName = SortName;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
