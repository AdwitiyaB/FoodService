package com.foodservice.app.service;

import com.foodservice.app.model.FoodItem;
import com.foodservice.app.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository repository;

    public List<FoodItem> getAllFoodItems() {
        return repository.findAll();
    }

    public FoodItem getFoodItemById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public FoodItem saveFoodItem(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public void deleteFoodItem(Long id) {
        repository.deleteById(id);
    }
}
