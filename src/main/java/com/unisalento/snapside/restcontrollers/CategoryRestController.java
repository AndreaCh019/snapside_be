package com.unisalento.snapside.restcontrollers;

import com.unisalento.snapside.adapters.CategoryAdapter;
import com.unisalento.snapside.exceptions.CategoryNotFoundException;
import com.unisalento.snapside.generated.domain.CategoryEntity;
import com.unisalento.snapside.iservices.ICategoryService;
import com.unisalento.snapside.models.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController()
@RequestMapping(value="/category")
public class CategoryRestController {
    @Autowired
    ICategoryService categoryService;

    public CategoryRestController() { super(); }
    public CategoryRestController(ICategoryService categoryService) { this.categoryService = categoryService; }

    @RequestMapping(value="/getAll", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryDTO> getAll() throws CategoryNotFoundException {
        List<CategoryDTO> dtos = new ArrayList<CategoryDTO>();
        List<CategoryEntity> entities = categoryService.getAll();
        Iterator<CategoryEntity> iteratorElement = entities.iterator();
        while(iteratorElement.hasNext()){
            CategoryEntity category = iteratorElement.next();
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO= CategoryAdapter.CategoryEntityToCategoryDTO(category);
            dtos.add(categoryDTO);
        }
        return dtos;
    }

    @GetMapping(value="/getById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public CategoryDTO getById(@PathVariable("id") int id) throws CategoryNotFoundException{
        CategoryDTO categoryDTO = new CategoryDTO();
        CategoryEntity category = new CategoryEntity();
        category = categoryService.getById(id);
        categoryDTO = CategoryAdapter.CategoryEntityToCategoryDTO(category);
        return categoryDTO;
    }

}
