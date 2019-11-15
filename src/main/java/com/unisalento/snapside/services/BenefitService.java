package com.unisalento.snapside.services;

import com.unisalento.snapside.exceptions.BenefitNotFoundException;
import com.unisalento.snapside.generated.domain.BenefitEntity;
import com.unisalento.snapside.repositories.BenefitRepository;
import com.unisalento.snapside.iservices.IBenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BenefitService implements IBenefitService {

    @Autowired
    BenefitRepository benefitRepository;

    @Override
    public List<BenefitEntity> getAll() throws BenefitNotFoundException {
        // TODO Auto-generated method stub
        return benefitRepository.findAll();
    }

    @Override
    public BenefitEntity getById(int id) throws BenefitNotFoundException {
        // TODO Auto-generated method stub
        return benefitRepository.getOne(id);
    }
}
