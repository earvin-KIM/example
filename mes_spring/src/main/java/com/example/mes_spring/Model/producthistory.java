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
@Table(name = "producthistory")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class producthistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Carryover")
    private Integer Carryover;

    @Column(name = "ChangeReason")
    private String ChangeReason;

    @Column(name = "RealRetention")
    private String RealRetention;

    @Column(name = "VarianceQuantity")
    private Integer VarianceQuantity;

    @Column(name = "OderSheetCode")
    private String OderSheetCode;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;



    @Builder  // alt insert   맨위에거 누르기
    public producthistory(Integer ID, Integer Carryover, String ChangeReason, String RealRetention, Integer VarianceQuantity,String ProductCode,String WriteDate, String Writer) {
        this.ID = ID;
        this.Carryover = Carryover;
        this.ChangeReason = ChangeReason;
        this.RealRetention = RealRetention;
        this.VarianceQuantity = VarianceQuantity;
        this.OderSheetCode = OderSheetCode;
        this.ProductCode = ProductCode;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
