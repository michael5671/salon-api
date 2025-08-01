package com.example.salon_api.repository;

import com.example.salon_api.entity.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SalonServiceDetailRepository extends JpaRepository<SalonServiceDetail, BigInteger> {
}
