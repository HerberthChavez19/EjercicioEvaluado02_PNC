package com.example.laboratorioevaluado02_pnc.repository;

import com.example.laboratorioevaluado02_pnc.domain.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, UUID> {

}