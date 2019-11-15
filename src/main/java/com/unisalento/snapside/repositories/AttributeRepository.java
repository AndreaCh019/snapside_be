package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.AttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepository extends JpaRepository<AttributeEntity, Integer> {
}
