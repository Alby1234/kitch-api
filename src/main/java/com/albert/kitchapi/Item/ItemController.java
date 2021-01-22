package com.albert.kitchapi.Item;

import com.albert.kitchapi.ApiController;
import com.albert.kitchapi.User.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController implements ApiController {

    @Autowired
    private ItemService itemService;

    @GetMapping("item/{itemId}")
    public Item getItem(@PathVariable Long itemId){
        return itemService.getItem(itemId);
    }

    @GetMapping("items/{userId}")
    public List<Item> getItemsForUser(@PathVariable Long userId) throws NotFoundException {return itemService.getItemsForUser(userId);}


}
