package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.ItemEntity;
import com.unisalento.snapside.models.ItemDTO;

public class ItemAdapter {
    public static ItemEntity ItemDTOToItemEntity(ItemDTO itemDTO) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(itemDTO.getName());
        itemEntity.setDescription(itemDTO.getDescription());
        return itemEntity;
    }
    public static ItemDTO ItemEntityToItemDTO(ItemEntity itemEntity) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setName(itemEntity.getName());
        itemDTO.setDescription(itemEntity.getDescription());
        return itemDTO;
    }

}
