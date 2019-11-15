package com.unisalento.snapside.iservices;

import com.unisalento.snapside.exceptions.AttributeNotFoundException;
import com.unisalento.snapside.generated.domain.AttributeEntity;

import java.util.List;

public interface IAttributeService {
    public List<AttributeEntity> getAll() throws AttributeNotFoundException;
    public AttributeEntity getById(int id) throws AttributeNotFoundException;
}
