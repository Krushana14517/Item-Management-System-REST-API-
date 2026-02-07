package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Item;
import com.crud.service.ItemDataStore;

import jakarta.validation.Valid;


@RestController
public class ItemController {

	
	@Autowired
	ItemDataStore store;
	
	
	//get by id 
	@GetMapping("/getItem/{id}")
	public Item getSingleItem(@PathVariable Integer id)
	{
		 return store.getById(id);
	}
	
	
	// add new item
	@PostMapping("/addItem")
	public  Item addItem( @Valid @RequestBody Item item)  //@valid use for check validation
	{
		return store.addNewItem(item);
	}
	
	
	//get all 
		@GetMapping("/getItem")
		public  List<Item> getAllItem()
		{
			 return  store.getAll();
		}
		
		
		
	//update item by id 
		@PutMapping("/{id}")
	    public Item updateItem(  @Valid @RequestBody Item item,  @PathVariable Integer id) {
	        return store.updateItem(item, id);
	    }
		
		
		
	//delete by id 
		@DeleteMapping("/delete/{id}")
		public String deleteItem(@PathVariable Integer id) {
		    return store.deleteItem(id);
		}
		
		
		
}
