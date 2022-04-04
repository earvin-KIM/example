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
@Table(name = "rawinspection")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class rawinspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ForeignBody")
    private String ForeignBody;

    @Column(name = "Fresh")
    private String Fresh;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "MaterialTemperature")
    private Double MaterialTemperature;

    @Column(name = "Outside")
    private String Outside;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Packing")
    private String Packing;

    @Column(name = "ReceiptDate")
    private String ReceiptDate;

    @Column(name = "Smell")
    private String Smell;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public rawinspection(Integer ID, String ForeignBody, String Fresh, String MaterialCode, Double MaterialTemperature, String Outside,
                      String Description, String Packing, String ReceiptDate, String Smell,String WriteDate, String Writer ) {
        this.ID = ID;
        this.ForeignBody = ForeignBody;
        this.Fresh = Fresh;
        this.MaterialCode = MaterialCode;
        this.MaterialTemperature = MaterialTemperature;
        this.Outside = Outside;
        this.Description = Description;
        this.Packing = Packing;
        this.ReceiptDate = ReceiptDate;
        this.Smell = Smell;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
