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
@Table(name = "noticeboard")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class noticeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "GuideDocument")
    private String GuideDocument;

    @Column(name = "Location")
    private String Location;

    @Column(name = "Preview")
    private String Preview;

    @Column(name = "Subtitle")
    private String Subtitle;

    @Column(name = "Title")
    private String Title;

    @Column(name = "ToDo")
    private String ToDo;

    @Column(name = "When")
    private String When;

    @Column(name = "Where")
    private String Where;

    @Column(name = "Who")
    private String Who;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public noticeboard(Integer ID, String GuideDocument, String Location, String Preview, String Subtitle, String Title,
                  String ToDo, String When, String Where, String Who, String Manager,String WriteDate, String Writer) {
        this.ID = ID;
        this.GuideDocument = GuideDocument;
        this.Location = Location;
        this.Preview = Preview;
        this.Subtitle = Subtitle;
        this.Title = Title;
        this.ToDo = ToDo;
        this.When = When;
        this.Where = Where;
        this.Who = Who;
        this.Manager = Manager;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
