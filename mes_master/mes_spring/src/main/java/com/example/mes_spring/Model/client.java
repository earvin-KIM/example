package com.example.mes_spring.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Catery")
    private String Catery;

    @Column(name = "ClientCode")
    private String ClientCode;

    @Column(name = "ClientName")
    private String ClientName;

    @Column(name = "CompanyNumber")
    private String CompanyNumber;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Division")
    private String Division;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Fax")
    private String Fax;

    @Column(name = "Manager")
    private String Manager;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name = "Representative")
    private String Representative;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "ZipCode")
    private String ZipCode;


    @Builder  // alt insert   맨위에거 누르기
    public client(Integer ID, String Address, String Catery, String ClientCode, String ClientName, String CompanyNumber,
                  String Description, String Division, String Email, String Fax, String Manager, String PhoneNumber,
                  String Representative, String WriteDate, String Writer, String ZipCode ) {
        this.ID = ID;
        this.Address = Address;
        this.Catery = Catery;
        this.ClientCode = ClientCode;
        this.ClientName = ClientName;
        this.CompanyNumber = CompanyNumber;
        this.Description = Description;
        this.Division = Division;
        this.Email = Email;
        this.Fax = Fax;
        this.Manager = Manager;
        this.PhoneNumber = PhoneNumber;
        this.Representative = Representative;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.ZipCode = ZipCode;

    }
}
