package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.AdEntity;
import com.unisalento.snapside.models.AdDTO;

public class AdAdapter {
    public static AdEntity AdDTOToAdEntity(AdDTO adDTO) {
        AdEntity ad = new AdEntity();
        ad.setTitle(adDTO.getTitle());
        ad.setDescription(adDTO.getDescription());
        ad.setSellPrice(adDTO.getSellPrice());
        ad.setAddress(adDTO.getAddress());
        ad.setCoordinates(adDTO.getCoordinates());
        ad.setApproved(adDTO.getApproved());
        ad.setActive(adDTO.getActive());
        ad.setBeginDate(adDTO.getBeginDate());
        ad.setEndDate(adDTO.getEndDate());
        ad.setAdType(adDTO.getAdType());
        return ad;
    }

    public static AdDTO AdEntityToAdDTO(AdEntity ad) {
        AdDTO adDTO = new AdDTO();
        adDTO.setIdAd(ad.getIdAd());
        adDTO.setTitle(ad.getTitle());
        adDTO.setDescription(ad.getDescription());
        adDTO.setSellPrice(ad.getSellPrice());
        adDTO.setAddress(ad.getAddress());
        adDTO.setCoordinates(ad.getCoordinates());
        adDTO.setApproved(ad.getApproved());
        adDTO.setActive(ad.getActive());
        adDTO.setBeginDate(ad.getBeginDate());
        adDTO.setEndDate(ad.getEndDate());
        adDTO.setAdType(ad.getAdType());
        return adDTO;
    }

}
