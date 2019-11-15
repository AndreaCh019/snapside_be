package com.unisalento.snapside.restcontrollers;

import com.unisalento.snapside.adapters.BenefitAdapter;
import com.unisalento.snapside.exceptions.BenefitNotFoundException;
import com.unisalento.snapside.generated.domain.BenefitEntity;
import com.unisalento.snapside.iservices.IBenefitService;
import com.unisalento.snapside.models.BenefitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController()
@RequestMapping(value="/benefit")
public class BenefitRestController {
    @Autowired
    IBenefitService benefitService;

    public BenefitRestController() { super(); }

    public BenefitRestController(IBenefitService benefitService) { this.benefitService = benefitService; }

    @RequestMapping(value="/getAll", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<BenefitDTO> getAll() throws BenefitNotFoundException {
        List<BenefitDTO> dtos = new ArrayList<BenefitDTO>();
        List<BenefitEntity> entities = benefitService.getAll();
        Iterator<BenefitEntity> iteratorElement = entities.iterator();
        while(iteratorElement.hasNext()){
            BenefitEntity benefit = iteratorElement.next();
            BenefitDTO benefitDTO = new BenefitDTO();
            benefitDTO= BenefitAdapter.BenefitEntityToBenefitDTO(benefit);
            dtos.add(benefitDTO);
        }
        return dtos;
    }

    @GetMapping(value="/getById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public BenefitDTO getById(@PathVariable("id") int id) throws BenefitNotFoundException{
        BenefitDTO benefitDTO = new BenefitDTO();
        BenefitEntity benefit = new BenefitEntity();
        benefit = benefitService.getById(id);
        benefitDTO=BenefitAdapter.BenefitEntityToBenefitDTO(benefit);
        return benefitDTO;
    }

}

