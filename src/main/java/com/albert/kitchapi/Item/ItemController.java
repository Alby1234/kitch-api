package com.albert.kitchapi.Item;

import com.albert.kitchapi.ApiController;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController implements ApiController {

    @Autowired
    private ItemService itemService;

    @GetMapping("user/{userId}/items")
    public List<Item> getItemsForUser(@PathVariable Long userId) throws NotFoundException {return itemService.getItemsForUser(userId);}

    @PostMapping("user/{userId}/item")
    public void addItemForUser(@PathVariable Long userId, @RequestBody Item item) throws NotFoundException {
        itemService.addItemForUser(userId, item);
    }

    @DeleteMapping("item/{itemId}")
    public void deleteItem(@PathVariable Long itemId){
        itemService.deleteItem(itemId);
    }


}
