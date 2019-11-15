package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.CategoryEntity;
import com.unisalento.snapside.models.CategoryDTO;

public class CategoryAdapter {
    public static CategoryEntity CategoryDTOToCategoryEntity(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryname(categoryDTO.getCategoryname());
        categoryEntity.setDescription(categoryDTO.getDescription());
        return categoryEntity;
    }

    public static CategoryDTO CategoryEntityToCategoryDTO(CategoryEntity categoryEntity) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryname(categoryEntity.getCategoryname());
        categoryDTO.setDescription(categoryDTO.getDescription());
        return categoryDTO;
    }
}
