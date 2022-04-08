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
@Table(name = "department")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "DepartmentCode")
    private String DepartmentCode;

    @Column(name = "DepartmentName")
    private String DepartmentName;

    @Column(name = "Position")
    private String Position;

    @Column(name = "CompanyNumber")
    private String CompanyNumber;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public department(Integer ID, String DepartmentCode, String DepartmentName, String Position,  String CompanyNumber,
                      String Description, String Manager,  String WriteDate, String Writer ) {
        this.ID = ID;
        this.DepartmentCode = DepartmentCode;
        this.DepartmentName = DepartmentName;
        this.Position = Position;
        this.CompanyNumber = CompanyNumber;
        this.Description = Description;
        this.Manager = Manager;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
