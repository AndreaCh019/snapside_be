package com.unisalento.snapside.services;

import com.unisalento.snapside.exceptions.AdNotFoundException;
import com.unisalento.snapside.generated.domain.AdEntity;
import com.unisalento.snapside.repositories.AdRepository;
import com.unisalento.snapside.iservices.IAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdService implements IAdService {

    @Autowired
    AdRepository adRepository;

    @Override
    public List<AdEntity> getAll() throws AdNotFoundException {
        // TODO Auto-generated method stub
        return adRepository.findAll();
    }

    @Override
    public AdEntity getById(int id) throws AdNotFoundException {
        // TODO Auto-generated method stub
        return adRepository.getOne(id);
    }

    @Override
    public AdEntity save(AdEntity ad) {
        // TODO Auto-generated method stub
        return adRepository.save(ad);
    }

}
