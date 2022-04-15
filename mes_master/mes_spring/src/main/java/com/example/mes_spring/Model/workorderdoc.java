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
@Table(name = "workorderdoc")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class workorderdoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "CheckDate")
    private String CheckDate;

    @Column(name = "ConfirmMan")
    private String ConfirmMan;

    @Column(name = "DueDate")
    private String DueDate;

    @Column(name = "MaterialCode")
    private String MaterialCode;

    @Column(name = "MTotalQuantity")
    private String MTotalQuantity;

    @Column(name = "Description")
    private String Description;

    @Column(name = "OrderNumber")
    private String OrderNumber;

    @Column(name = "Priority")
    private String Priority;

    @Column(name = "ProductCode")
    private String ProductCode;

    @Column(name = "ProcessChartName1")
    private Integer ProcessChartName1;

    @Column(name = "ProcessChartName2")
    private String ProcessChartName2;

    @Column(name = "PTotalQuantity")
    private Integer PTotalQuantity;

    @Column(name = "WriteDate")
    private String WriteDate;

    @Column(name = "Writer")
    private String Writer;

    @Column(name = "Remainder")
    private Integer Remainder;

    @Column(name = "ShipRemainder")
    private Integer ShipRemainder;

    @Column(name = "State")
    private String State;


    @Column(name = "WorkOrderDocNumber")
    private String WorkOrderDocNumber;

    @Column(name = "Workload")
    private Integer Workload;


    @Builder  // alt insert   맨위에거 누르기
    public workorderdoc(Integer ID, String CheckDate, String ConfirmMan, String DueDate, String MaterialCode, String MTotalQuantity,
                      String Description, String OrderNumber, String Priority, String ProductCode, Integer ProcessChartName1, String ProcessChartName2,
                      Integer PTotalQuantity, String WriteDate, String Writer, Integer Remainder, Integer ShipRemainder, String State, Integer Workload, String WorkOrderDocNumber ) {
        this.ID = ID;
        this.CheckDate = CheckDate;
        this.ConfirmMan = ConfirmMan;
        this.DueDate = DueDate;
        this.MaterialCode = MaterialCode;
        this.MTotalQuantity = MTotalQuantity;
        this.Description = Description;
        this.OrderNumber = OrderNumber;
        this.Priority = Priority;
        this.ProductCode = ProductCode;
        this.ProcessChartName1 = ProcessChartName1;
        this.ProcessChartName2 = ProcessChartName2;
        this.PTotalQuantity = PTotalQuantity;
        this.WriteDate = WriteDate;
        this.Writer = Writer;
        this.Remainder = Remainder;
        this.ShipRemainder = ShipRemainder;
        this.State = State;
        this.Workload = Workload;
        this.WorkOrderDocNumber = WorkOrderDocNumber;
    }
}
