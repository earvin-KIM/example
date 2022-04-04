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
@Table(name = "worker")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Belong")
    private String Belong;

    @Column(name = "BlockedDate")
    private String BlockedDate;

    @Column(name = "BlockedUser")
    private String BlockedUser;

    @Column(name = "Country")
    private String Country;

    @Column(name = "Department")
    private String Department;

    @Column(name = "Font")
    private String Font;

    @Column(name = "Hiredate")
    private String Hiredate;

    @Column(name = "LoginBlock")
    private String LoginBlock;

    @Column(name = "MESAutority")
    private String MESAutority;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Position")
    private String Position;

    @Column(name = "PWCDate")
    private String PWCDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Skin")
    private String Skin;

    @Column(name = "Task")
    private String Task;

    @Column(name = "WorkerCode")
    private String WorkerCode;


    @Builder  // alt insert   맨위에거 누르기
    public worker(Integer ID, String Belong, String BlockedDate, String BlockedUser, String Country, String Department,
                      String Font, String Hiredate, String LoginBlock, String MESAutority, String Name, String Password,
                      String Position, String PWCDate, String Writer, String Skin, String Task, String WorkerCode ) {
        this.ID = ID;
        this.Belong = Belong;
        this.BlockedDate = BlockedDate;
        this.BlockedUser = BlockedUser;
        this.Country = Country;
        this.Department = Department;
        this.Font = Font;
        this.Hiredate = Hiredate;
        this.LoginBlock = LoginBlock;
        this.MESAutority = MESAutority;
        this.Name = Name;
        this.Password = Password;
        this.Position = Position;
        this.PWCDate = PWCDate;
        this.Writer = Writer;
        this.Skin = Skin;
        this.Task = Task;
        this.WorkerCode = WorkerCode;

    }
}
