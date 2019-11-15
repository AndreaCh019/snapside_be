package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.BenefitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BenefitRepository extends JpaRepository<BenefitEntity, Integer> {
}
