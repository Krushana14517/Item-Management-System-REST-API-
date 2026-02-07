package com.crud.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	
	//use  Wrapper class for handling null
	
	
	private Integer id; 
	
	//validation
	@NotBlank(message = "Product name is required")
	private String name;
	
	@Size(min = 10, message = "Description must be at least 10 characters")
	private String description;
	
	@NotNull(message = "Price cannot be empty")
    @Positive(message = "Price must be greater than 0")
	private Double price;
	
	@NotBlank(message = "Category is required")
    private String category;
	
	
	
}
