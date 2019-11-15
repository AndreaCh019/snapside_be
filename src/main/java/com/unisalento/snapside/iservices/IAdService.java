package com.unisalento.snapside.iservices;

import com.unisalento.snapside.exceptions.AdNotFoundException;
import com.unisalento.snapside.generated.domain.AdEntity;
import java.util.List;

public interface IAdService {
    public List<AdEntity> getAll() throws AdNotFoundException;
    public AdEntity getById(int id) throws AdNotFoundException;
    public AdEntity save(AdEntity ad);
}
