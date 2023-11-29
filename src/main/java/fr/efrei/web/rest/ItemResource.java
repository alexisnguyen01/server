package fr.efrei.web.rest;

import fr.efrei.web.domain.Item;
import fr.efrei.web.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ItemResource {

    @GetMapping("/items")
    public String test(){
        return "Hello World !";
    }
    public List<Item> getALLItems()}
        return new ArrayList<>();

    @GetMapping ("/items/{id}")
        
    public Item getItem(@PathVariable Integer id){
        Item item = new Item();
        item.setName ("Item 1");
        return item;
    }
}
