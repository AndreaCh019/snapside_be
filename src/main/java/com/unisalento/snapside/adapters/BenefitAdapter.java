package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.BenefitEntity;
import com.unisalento.snapside.models.BenefitDTO;

public class BenefitAdapter {
    public static BenefitEntity BenefitDTOToBenefitEntity(BenefitDTO benefitDTO) {
        BenefitEntity benefitEntity = new BenefitEntity();
        benefitEntity.setCheckinDate(benefitDTO.getCheckinDate());
        benefitEntity.setCheckoutDate(benefitDTO.getCheckoutDate());
        benefitEntity.setInterested(benefitDTO.getInterested());
        benefitEntity.setPaymentType(benefitDTO.getPaymentType());
        benefitEntity.setPaidAmount(benefitDTO.getPaidAmount());
        benefitEntity.setPaid(benefitDTO.getPaid());
        return benefitEntity;
    }

    public static BenefitDTO BenefitEntityToBenefitDTO(BenefitEntity benefitEntity) {
        BenefitDTO benefitDTO = new BenefitDTO();
        benefitDTO.setCheckinDate(benefitEntity.getCheckinDate());
        benefitDTO.setCheckoutDate(benefitEntity.getCheckoutDate());
        benefitDTO.setInterested(benefitEntity.getInterested());
        benefitDTO.setPaymentType(benefitEntity.getPaymentType());
        benefitDTO.setPaidAmount(benefitEntity.getPaidAmount());
        benefitDTO.setPaid(benefitEntity.getPaid());
        return benefitDTO;
    }
}
