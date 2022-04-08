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
@Table(name = "workperformance")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class workperformance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Lavorer")
    private String Lavorer;

    @Column(name = "ProcessCode")
    private String ProcessCode;

    @Column(name = "WorkOrderDocNumber")
    private String WorkOrderDocNumber;


    @Column(name = "Description")
    private String Description;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public workperformance(Integer ID, String Lavorer, String ProcessCode, String WorkOrderDocNumber,
                      String Description, String WriteDate, String Writer) {
        this.ID = ID;
        this.Lavorer = Lavorer;
        this.ProcessCode = ProcessCode;
        this.WorkOrderDocNumber = WorkOrderDocNumber;
        this.Description = Description;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
