package com.unisalento.snapside.services;

import com.unisalento.snapside.exceptions.ItemNotFoundException;
import com.unisalento.snapside.generated.domain.ItemEntity;
import com.unisalento.snapside.repositories.ItemRepository;
import com.unisalento.snapside.iservices.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService implements IItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<ItemEntity> getAll() throws ItemNotFoundException {
        // TODO Auto-generated method stub
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity getById(int id) throws ItemNotFoundException {
        // TODO Auto-generated method stub
        return itemRepository.getOne(id);
    }

}