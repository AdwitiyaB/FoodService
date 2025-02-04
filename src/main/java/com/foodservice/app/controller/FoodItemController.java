package com.foodservice.app.controller;

import com.foodservice.app.model.FoodItem;
import com.foodservice.app.service.FoodItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food-items")
@Tag(name = "Food Item API", description = "CRUD operations for Food Items")
public class FoodItemController {
    @Autowired
    private FoodItemService service;

    @GetMapping
    @Operation(summary = "Get all food items")
    public List<FoodItem> getAllFoodItems() {
        return service.getAllFoodItems();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get food item by ID")
    public FoodItem getFoodItemById(@PathVariable Long id) {
        return service.getFoodItemById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new food item")
    public FoodItem createFoodItem(@RequestBody FoodItem foodItem) {
        return service.saveFoodItem(foodItem);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a food item by ID")
    public void deleteFoodItem(@PathVariable Long id) {
        service.deleteFoodItem(id);
    }
}