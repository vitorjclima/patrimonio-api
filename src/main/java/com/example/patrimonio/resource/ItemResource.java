package com.example.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.patrimonio.model.Item;
import com.example.patrimonio.repository.ItemRepository;

@RestController
//@CrossOrigin("${permission}")
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/item")
    public List<Item> listar() {
        return itemRepository.findAll();
    }

    @PostMapping("/item")
    public Item adicionar(@RequestBody @Valid Item item) {
        return itemRepository.save(item);
    }

}
