package com.unisalento.snapside.iservices;

import com.unisalento.snapside.exceptions.BenefitNotFoundException;
import com.unisalento.snapside.generated.domain.BenefitEntity;
import java.util.List;

public interface IBenefitService {
    public List<BenefitEntity> getAll() throws BenefitNotFoundException;
    public BenefitEntity getById(int id) throws BenefitNotFoundException;
}
