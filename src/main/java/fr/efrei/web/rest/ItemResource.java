package fr.efrei.web.rest;

import fr.efrei.web.domain.Item;
import fr.efrei.web.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
    
public class ItemResource {
    
    public final ItemService itemService;
    
    public ItemRessource(ItemService itemservice) {this.itemService = itemService;}
    
    @GetMapping ("/items")
    public List<item> getALLItems() {return itemService.findAll();}
}
