package com.albert.kitchapi.Item;

import com.albert.kitchapi.User.User;
import com.albert.kitchapi.User.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    public Item getItem(Long id){
        return itemRepository.findById(id).orElse(null);
    }

    public List<Item> getItemsForUser(Long userId) {
        return itemRepository.findByUser(userRepository.findById(userId).orElse(null));
    }

    public void addItemForUser(Long userId, Item item) throws NotFoundException {
        User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found"));
        user.addItem(item);
        item.setUser(user);
        userRepository.saveAndFlush(user);
        itemRepository.saveAndFlush(item);
    }

    public void deleteItem(Long itemId){
        itemRepository.deleteById(itemId);
    }
}
