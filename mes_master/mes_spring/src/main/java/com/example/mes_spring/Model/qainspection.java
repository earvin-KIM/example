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
@Table(name = "qainspection")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class qainspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ErrorCode")
    private String ErrorCode;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "Process")
    private String Process;

    @Column(name = "QAInspection")
    private String QAInspection;

    @Column(name = "Result")
    private String Result;

    @Column(name = "Description")
    private String Description;

    @Column(name = "SortName")
    private String SortName;

    @Column(name = "TagFrom")
    private String TagFrom;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "Quantity")
    private String Quantity;

    @Column(name = "TagTo")
    private String TagTo;

    @Column(name = "WorkOrderDocNumber")
    private String WorkOrderDocNumber;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;


    @Builder  // alt insert   맨위에거 누르기
    public qainspection(Integer ID, String ErrorCode, String MaterialCode, String Process, String QAInspection, String Result,
                      String Description, String SortName, String TagFrom, String ProductCode, String Quantity, String TagTo,
                      String WorkOrderDocNumber, String WriteDate, String Writer) {
        this.ID = ID;
        this.ErrorCode = ErrorCode;
        this.MaterialCode = MaterialCode;
        this.Process = Process;
        this.QAInspection = QAInspection;
        this.Result = Result;
        this.Description = Description;
        this.SortName = SortName;
        this.TagFrom = TagFrom;
        this.ProductCode = ProductCode;
        this.Quantity = Quantity;
        this.TagTo = TagTo;
        this.WorkOrderDocNumber = WorkOrderDocNumber;
        this.WriteDate = WriteDate;
        this.Writer = Writer;

    }
}
