package lk.ijse.shop.services.impl;

import lk.ijse.shop.entity.Item;
import lk.ijse.shop.repository.ItemRepo;
import lk.ijse.shop.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepository;

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(String id, Item item) {
        Optional<Item> existItemOptional = itemRepository.findById(id);

        if (existItemOptional.isPresent()) {
            Item existItem = existItemOptional.get();
            existItem.setItemCode(item.getItemCode());
            existItem.setDescription(item.getDescription());
            existItem.setPack(item.getPack());
            existItem.setUnitPrice(item.getUnitPrice());
            existItem.setQoh(item.getQoh());

            return itemRepository.save(existItem);
        }else {
            return null;
        }
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
