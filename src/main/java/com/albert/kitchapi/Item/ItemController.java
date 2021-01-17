package com.albert.kitchapi.Item;

import com.albert.kitchapi.ApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController implements ApiController {

    @Autowired
    private ItemService itemService;

    @GetMapping("item/{id}")
    public Item getItem(@PathVariable Long id){
        return itemService.getItem(id);
    }


}
