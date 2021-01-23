package com.albert.kitchapi.Item;

import javassist.NotFoundException;
import java.util.List;

public interface ItemService {
    public Item getItem(Long id);

    public List<Item> getItemsForUser(Long userId);

    public void addItemForUser(Long userId, Item item) throws NotFoundException;

    public void deleteItem(Long itemId);

}
