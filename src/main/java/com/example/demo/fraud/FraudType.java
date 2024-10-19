package com.example.demo.fraud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fraud_type")
public class FraudType {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fraud_type_id")
    private Long fraudTypeId;

    @Column(name = "fraud_type_name", nullable = false)
    private String fraudTypeName;

    @Column(name = "description")
    private String description;

    // Constructors
    public FraudType() {}

    public FraudType(String fraudTypeName, String description) {
        this.fraudTypeName = fraudTypeName;
        this.description = description;
    }

    // Getters and Setters
    public Long getFraudTypeId() {
        return fraudTypeId;
    }

    public void setFraudTypeId(Long fraudTypeId) {
        this.fraudTypeId = fraudTypeId;
    }

    public String getFraudTypeName() {
        return fraudTypeName;
    }

    public void setFraudTypeName(String fraudTypeName) {
        this.fraudTypeName = fraudTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
