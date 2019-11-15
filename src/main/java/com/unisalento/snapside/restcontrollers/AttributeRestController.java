package com.unisalento.snapside.restcontrollers;


import com.unisalento.snapside.adapters.AttributeAdapter;
import com.unisalento.snapside.exceptions.AttributeNotFoundException;
import com.unisalento.snapside.generated.domain.AttributeEntity;
import com.unisalento.snapside.iservices.IAttributeService;
import com.unisalento.snapside.models.AttributeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController()
@RequestMapping(value="/attribute")
public class AttributeRestController {
    @Autowired
    IAttributeService attributeService;

    public AttributeRestController() { super(); }

    public AttributeRestController(IAttributeService attributeService) { this.attributeService = attributeService; }

    @RequestMapping(value="/getAll", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<AttributeDTO> getAll() throws AttributeNotFoundException {
        List<AttributeDTO> dtos = new ArrayList<AttributeDTO>();
        List<AttributeEntity> entities = attributeService.getAll();
        Iterator<AttributeEntity> iteratorElement = entities.iterator();
        while(iteratorElement.hasNext()){
            AttributeEntity attribute = iteratorElement.next();
            AttributeDTO attributeDTO = new AttributeDTO();
            attributeDTO= AttributeAdapter.AttributeEntityToAttributeDTO(attribute);
            dtos.add(attributeDTO);
        }
        return dtos;
    }

    @GetMapping(value="/getById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public AttributeDTO getById(@PathVariable("id") int id) throws AttributeNotFoundException{
        AttributeDTO attributeDTO = new AttributeDTO();
        AttributeEntity attribute = new AttributeEntity();
        attribute = attributeService.getById(id);
        attributeDTO=AttributeAdapter.AttributeEntityToAttributeDTO(attribute);
        return attributeDTO;
    }

}
