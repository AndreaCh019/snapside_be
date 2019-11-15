package com.unisalento.snapside.services;

import com.unisalento.snapside.exceptions.CategoryNotFoundException;
import com.unisalento.snapside.generated.domain.CategoryEntity;
import com.unisalento.snapside.iservices.ICategoryService;
import com.unisalento.snapside.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> getAll() throws CategoryNotFoundException {
        // TODO Auto-generated method stub
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity getById(int id) throws CategoryNotFoundException {
        // TODO Auto-generated method stub
        return categoryRepository.getOne(id);
    }
}
