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
@Table(name = "fileboard")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class fileboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Document")
    private String Document;

    @Column(name = "Catery")
    private String Catery;

    @Column(name = "FileNumber")
    private String FileNumber;

    @Column(name = "Tag")
    private Integer Tag;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public fileboard(Integer ID, String Document, String Catery, String FileNumber, Integer Tag, String Title,
                  String Description, String WriteDate, String Writer) {
        this.ID = ID;
        this.Document = Document;
        this.Catery = Catery;
        this.FileNumber = FileNumber;
        this.Tag = Tag;
        this.Title = Title;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
