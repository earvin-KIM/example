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
@Table(name = "rawhistory")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rawhistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Carryover")
    private String Carryover;

    @Column(name = "ChangeReason")
    private String ChangeReason;

    @Column(name = "DisposalQuantity")
    private String DisposalQuantity;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "RealRetention")
    private String RealRetention;

    @Column(name = "ReturnQuantity")
    private String ReturnQuantity;

    @Column(name = "VarianceQuantity")
    private String VarianceQuantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public rawhistory(Integer ID, String Carryover, String ChangeReason, String DisposalQuantity, String MaterialCode, String RealRetention,
                      String ReturnQuantity, String VarianceQuantity,String WriteDate, String Writer) {
        this.ID = ID;
        this.Carryover = Carryover;
        this.ChangeReason = ChangeReason;
        this.DisposalQuantity = DisposalQuantity;
        this.MaterialCode = MaterialCode;
        this.RealRetention = RealRetention;
        this.ReturnQuantity = ReturnQuantity;
        this.VarianceQuantity = VarianceQuantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
