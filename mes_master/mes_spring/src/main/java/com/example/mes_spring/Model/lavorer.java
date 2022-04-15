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
@Table(name = "lavorer")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class lavorer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Country")
    private String Country;

    @Column(name = "Hiredate")
    private String Hiredate;

    @Column(name = "LavorerCode")
    private String LavorerCode;

    @Column(name = "MemberType")
    private String MemberType;

    @Column(name = "NightShift")
    private String NightShift;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Position")
    private String Position;

    @Column(name = "ProcessName")
    private String ProcessName;

    @Column(name = "Spot")
    private String Spot;

    @Column(name = "WorkerCode")
    private String WorkerCode;

    @Column(name = "WorkingTime")
    private String WorkingTime;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public lavorer(Integer ID, String Country, String Hiredate, String LavorerCode, String MemberType, String NightShift,
                  String Description, String Position, String ProcessName, String Spot, String WorkerCode, String WorkingTime,
                  String WriteDate, String Writer) {
        this.ID = ID;
        this.Country = Country;
        this.Hiredate = Hiredate;
        this.LavorerCode = LavorerCode;
        this.MemberType = MemberType;
        this.NightShift = NightShift;
        this.Description = Description;
        this.Position = Position;
        this.ProcessName = ProcessName;
        this.Spot = Spot;
        this.WorkerCode = WorkerCode;
        this.WorkingTime = WorkingTime;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
    }
}
