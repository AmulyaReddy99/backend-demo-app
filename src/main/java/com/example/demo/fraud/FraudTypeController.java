package com.example.demo.fraud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fraud-types")
public class FraudTypeController {

    @Autowired
    private FraudTypeService fraudTypeService;

    @GetMapping
    public List<FraudType> getAllFraudTypes() {
        return fraudTypeService.getAllFraudTypes();
    }

    @PostMapping
    public FraudType createFraudType(@RequestBody FraudType fraudType) {
        return fraudTypeService.saveFraudType(fraudType);
    }
}
