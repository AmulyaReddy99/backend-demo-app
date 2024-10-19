package com.example.demo.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraudTypeService {

    @Autowired
    private FraudTypeRepository fraudTypeRepository;

    public List<FraudType> getAllFraudTypes() {
        return fraudTypeRepository.findAll();
    }

    public FraudType saveFraudType(FraudType fraudType) {
        return fraudTypeRepository.save(fraudType);
    }
}
