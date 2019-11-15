package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.AttributeEntity;
import com.unisalento.snapside.models.AttributeDTO;

public class AttributeAdapter {
    public static AttributeEntity AttributeDTOToAttributeEntity(AttributeDTO attributeDTO) {
        AttributeEntity attribute = new AttributeEntity();
        attribute.setAttributeName(attributeDTO.getAttributeName());
        attribute.setAttributeValue(attributeDTO.getAttributeValue());
        return attribute;
    }

    public static AttributeDTO AttributeEntityToAttributeDTO (AttributeEntity attribute) {
        AttributeDTO attributeDTO = new AttributeDTO();
        attributeDTO.setAttributeName(attribute.getAttributeName());
        attributeDTO.setAttributeValue(attribute.getAttributeValue());
        return attributeDTO;
    }
}
