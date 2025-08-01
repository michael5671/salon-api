package com.example.salon_api.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "slot")
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @CreationTimestamp
    @Column(name = "confirmed_at", nullable = false, updatable = false)
    private LocalDateTime confirmedAt;

    @CreationTimestamp
    @Column(name = "locked_at", nullable = false, updatable = false)
    private LocalDateTime lockedAt;

    private Integer status;

    @Column(name="stylish_name")
    private  String stylishName;

    @Column(name="selected_service")
    private BigInteger SelectedService;
}
