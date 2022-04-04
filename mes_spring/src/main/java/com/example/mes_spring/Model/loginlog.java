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
@Table(name = "loginlog")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class loginlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "EndLogin")
    private String EndLogin;

    @Column(name = "FailCount")
    private String FailCount;

    @Column(name = "IPAdress")
    private String IPAdress;

    @Column(name = "StartLogin")
    private String StartLogin;

    @Column(name = "WorkerCode")
    private String WorkerCode;

    @Builder  // alt insert   맨위에거 누르기
    public loginlog(Integer ID, String EndLogin, String FailCount, String IPAdress, String StartLogin, String WorkerCode
                  ) {
        this.ID = ID;
        this.EndLogin = EndLogin;
        this.FailCount = FailCount;
        this.IPAdress = IPAdress;
        this.StartLogin = StartLogin;
        this.WorkerCode = WorkerCode;


    }
}
