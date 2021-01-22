package com.albert.kitchapi.Item;

import com.albert.kitchapi.User.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    public Item getItem(Long id){
        return itemRepository.findById(id).orElse(null);
    }

    public List<Item> getItemsForUser(Long userId) throws NotFoundException {
        return userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found")).getItems();
    }
}
