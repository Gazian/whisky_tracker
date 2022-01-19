package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

    List<Distillery> findDistilleriesByRegion(String region);

    Optional<Distillery> findDistilleriesByName(String name);

}
