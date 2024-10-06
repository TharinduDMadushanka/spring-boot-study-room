package lk.ijse.shop.services;

import lk.ijse.shop.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    Item createItem(Item item);
    Item updateItem(String id,Item item);
    void deleteItem(String id);
    List<Item> getAllItems();
}
