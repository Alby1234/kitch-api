package com.albert.kitchapi.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;


    public Item getItem(Long id){
        return itemRepository.findById(id).orElse(null);
    }
}
