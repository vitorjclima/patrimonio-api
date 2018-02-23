package com.example.patrimonio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patrimonio.model.Item;
import com.example.patrimonio.repository.ItemRepository;

@RestController
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/item")
    public List<Item> listar(){
        return itemRepository.findAll();
    }

}
