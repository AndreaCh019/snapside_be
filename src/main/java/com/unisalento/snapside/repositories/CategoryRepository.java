package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
