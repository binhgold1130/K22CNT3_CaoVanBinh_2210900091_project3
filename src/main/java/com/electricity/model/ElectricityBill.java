package com.electricity.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "electricity_bills")
public class ElectricityBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "electricity_usage", nullable = false)
    private double electricityUsage; // Số điện tiêu thụ (kWh)

    @Column(name = "amount_due", nullable = false)
    private double amountDue; // Số tiền phải trả

    @Column(name = "billing_date")
    @Temporal(TemporalType.DATE)
    private Date billingDate;

    // Constructor không tham số
    public ElectricityBill() {
    }

    // Constructor đầy đủ
    public ElectricityBill(String customerName, double electricityUsage, double amountDue, Date billingDate) {
        this.customerName = customerName;
        this.electricityUsage = electricityUsage;
        this.amountDue = amountDue;
        this.billingDate = billingDate;
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    @Override
    public String toString() {
        return "ElectricityBill{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", electricityUsage=" + electricityUsage +
                ", amountDue=" + amountDue +
                ", billingDate=" + billingDate +
                '}';
    }
}
