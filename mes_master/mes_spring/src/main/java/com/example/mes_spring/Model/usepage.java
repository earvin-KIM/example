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
@Table(name = "usepage")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class usepage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "BigMenu")
    private String BigMenu;

    @Column(name = "Lavorer")
    private String Lavorer;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "Master")
    private String Master;

    @Column(name = "PageName")
    private String PageName;

    @Column(name = "SubMenu")
    private String SubMenu;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public usepage(Integer ID, String BigMenu, String Lavorer, String Manager, String Master, String PageName,
                      String SubMenu, String WriteDate, String Writer) {
        this.ID = ID;
        this.BigMenu = BigMenu;
        this.Lavorer = Lavorer;
        this.Manager = Manager;
        this.Master = Master;
        this.PageName = PageName;
        this.SubMenu = SubMenu;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
    }
}
