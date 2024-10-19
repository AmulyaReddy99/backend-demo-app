package com.example.demo.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudTypeRepository extends JpaRepository<FraudType, Long> {
}
