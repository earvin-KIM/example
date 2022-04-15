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
@Table(name = "processcode")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class processcode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ProcessCode")
    private String ProcessCode;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public processcode(Integer ID, String ProcessCode, String ProcessName,
                      String Description, String WriteDate, String Writer ) {
        this.ID = ID;
        this.ProcessCode = ProcessCode;
        this.ProcessName = ProcessName;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
    }
}
