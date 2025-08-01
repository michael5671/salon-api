package com.example.salon_api.repository;

import com.example.salon_api.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SlotRepository extends JpaRepository<Slot, BigInteger> {
}
