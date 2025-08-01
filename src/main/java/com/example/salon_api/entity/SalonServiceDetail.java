package com.example.salon_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salon_service_detail")
public class SalonServiceDetail {
    @Id
    private BigInteger id;

    private String description;

    private String name;

    private BigInteger price;

    @Column(name="time_in_minutes")
    private Integer timeInMinutes;
}
