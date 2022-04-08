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
@Table(name = "materialmove")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class materialmove {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Code")
    private String Code;

    @Column(name = "ErrorCode")
    private String ErrorCode;

    @Column(name = "InstructionKind")
    private String InstructionKind;

    @Column(name = "InstructionNumber")
    private String InstructionNumber;

    @Column(name = "OriginalQuantity")
    private Integer OriginalQuantity;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "TagFrom")
    private String TagFrom;

    @Column(name = "TagTo")
    private String TagTo;

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
    public materialmove(Integer ID, String Code, String ErrorCode, String InstructionKind, String InstructionNumber, Integer OriginalQuantity,
                  String Description, Integer Quantity, String TagFrom, String TagTo, String Manager, String PhoneNumber,
                  String Representative, String WriteDate, String Writer, String ZipCode ) {
        this.ID = ID;
        this.Code = Code;
        this.ErrorCode = ErrorCode;
        this.InstructionKind = InstructionKind;
        this.InstructionNumber = InstructionNumber;
        this.OriginalQuantity = OriginalQuantity;
        this.Description = Description;
        this.Quantity = Quantity;
        this.TagFrom = TagFrom;
        this.TagTo = TagTo;
        this.Manager = Manager;
        this.PhoneNumber = PhoneNumber;
        this.Representative = Representative;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.ZipCode = ZipCode;

    }
}
