package com.petproject.coffeshopmanager.repository;

import com.petproject.coffeshopmanager.model.Variety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarietyRepository extends JpaRepository<Variety, Long> {
}
