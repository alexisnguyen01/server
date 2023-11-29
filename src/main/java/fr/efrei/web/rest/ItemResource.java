package fr.efrei.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ItemResource {
    public final ItemService itemService;
    public ItemRessource(ItemService itemservice) {this.itemService = ItemService;}
    @GetMapping ("/items")
    public String test(){
    public List <item> getALLItems() {return itemService.findAll();}
}
