package com.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;

import com.crud.model.Item;

@Service
public class ItemDataStore {

	//in-memory data store
	private  List<Item> items = new ArrayList<>();
	
	
	private  AtomicInteger id= new AtomicInteger(101); // Starting  id from 101 
	
	
	
	//adding new item in list 
	public Item addNewItem( Item item)
	{
		item.setId(id.getAndIncrement());   // use setter method of obj       setId()
		  items.add(item);
		  return item;
	}
	
	
	
	//get item by id
	public Item getById(Integer id) 
	{
	
	    for (Item item : items)
	    {
	    	
	    	// use getter method of obj
	        if (item.getId().equals(id))   // if use  Item data = items.get(id); // give  IndexOutOfBoundsException
	        { 
	            return item; 
	        }
	    }
	    
	  
	    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This Id " + id + " is not present!!");
	}
	
	
	
	//get all item
	public  List<Item> getAll()
	{	
		return  items;
	}
	
	
	
	// update item by id 
	public Item updateItem(Item item , Integer id)
	{
		 for (Item data : items)
		 {
		       if (data.getId().equals(id))  
		       { 
		           data.setId(id);
		           data.setName(item.getName());
		           data.setDescription(item.getDescription());
		           data.setPrice(item.getPrice());
		           data.setCategory(item.getCategory());
		           
		           
		           
		           return data;
		       }
		       
		  }
		 
		 throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This Id " + id + " is not present!!");
				
		
	}
	
	
	
	//delete data by id 
	public String deleteItem(Integer id) {
	 
		Iterator<Item> iterator = items.iterator();
	    
	    while (iterator.hasNext()) {
	        Item data = iterator.next();
	        
	        if (data.getId().equals(id)) {
	            iterator.remove(); 
	            return "Item deleted successfully";
	        }
	    }
	    

	    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id " + id + " not found!");
	}
	
	
	
}
