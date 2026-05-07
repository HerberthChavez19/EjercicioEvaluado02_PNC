package com.example.laboratorioevaluado02_pnc.service.impl;

import com.example.laboratorioevaluado02_pnc.domain.entity.Wizard;
import com.example.laboratorioevaluado02_pnc.repository.WizardRepository;
import com.example.laboratorioevaluado02_pnc.service.WizardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WizardServiceImpl implements WizardService {
    private final WizardRepository productRepository;

    @Override
    public void createWizard(Wizard wizard) {
        productRepository.save(wizard);
    }
}
