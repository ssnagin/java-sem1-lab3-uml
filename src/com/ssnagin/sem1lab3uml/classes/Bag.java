/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import com.ssnagin.sem1lab3uml.exceptions.StorageOverflow;
import java.util.ArrayList;
import java.util.List;
import com.ssnagin.sem1lab3uml.interfaces.GrainCultureStorage;
import java.util.Arrays;
import java.util.Objects;

/**
 * 
 * @author DEVELOPER
 */
public class Bag implements GrainCultureStorage {
    public List<GrainCulture> grains;
    private int capacity;
    
    public Bag(int capacity) {
        this.capacity = capacity;
        this.grains = new ArrayList<GrainCulture>();
    }
    
    public void putInside(GrainCulture grainCulture) throws StorageOverflow {
        
        if (grainCulture == null) {
            throw new IllegalArgumentException("GrainCulture не может быть null");
        }

        // Если слишком тяжело для сумки, то вылезаем в ошибку:
        if (grainCulture.amount + this.calculateTotalWeight() > capacity) {
            throw new StorageOverflow();
        }
        
        this.grains.add(grainCulture);
    }
    
    // getter
    public int getCapacity() {
        return this.capacity;
    }
    
    public List<GrainCulture> retrieve() {
        return this.grains;
    }
    
    protected int calculateTotalWeight() {
        
        int result = 0;
        
        for (int i = 0; i < grains.size(); i++) {
            result += grains.get(i).amount;
        }
        return result;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        Bag other = (Bag) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.grains.equals(other.grains) &&
                capacity == other.capacity;
    }
    
    @Override
    public int hashCode() {
        return 11 * Objects.hashCode(this.grains) + 4 * Objects.hashCode(this.capacity);
    }
    
}
