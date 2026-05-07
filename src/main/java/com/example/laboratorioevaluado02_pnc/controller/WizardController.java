package com.example.laboratorioevaluado02_pnc.controller;

import com.example.laboratorioevaluado02_pnc.domain.entity.Wizard;
import com.example.laboratorioevaluado02_pnc.service.impl.WizardServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wizards")
@AllArgsConstructor
public class WizardController {
    private final WizardServiceImpl wizardService;

    @PostMapping("/create")
    public ResponseEntity<Wizard> createProduct(@RequestBody Wizard wizard) {
        wizardService.createWizard(wizard);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(wizard);
    }

    
}
