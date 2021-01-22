package com.albert.kitchapi.User;

import com.albert.kitchapi.Item.Item;
import com.albert.kitchapi.Item.ItemRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ItemRepository itemRepository;

    public Long newRandomUser(){
        User rando = new User("Random", "User");
        return userRepository.save(rando).getId();
    }

    public void randomItemForUser (Long id) throws NotFoundException{
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found"));
        Item item = new Item("bread", "slices", 5, user);
        user.addItem(item);
        itemRepository.save(item);
        userRepository.save(user);
    }
}
