/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import java.util.ArrayList;
import java.util.List;
import com.ssnagin.sem1lab3uml.interfaces.GrainCultureStorage;
import java.util.Objects;

/**
 *
 * @author DEVELOPER
 */
public class GrainStorage implements GrainCultureStorage {
    
    public int capacity;
    public List<GrainCulture> grains = new ArrayList<GrainCulture>();
    
    public int getSize() {
        return 0;
    }
   
    public List<GrainCulture> retrieve() {
        return this.grains;
    }
    
    public void putInside(GrainCulture grainCulture) {
        if (grainCulture == null) {
            throw new IllegalArgumentException("GrainCulture не может быть null");
        }
        
        this.grains.add(grainCulture);
    }
    
    public void putInside(List<GrainCulture> grainCultures) {
        this.grains.addAll(grainCultures);
    }
    
    public void putInside(Bag bag) {
        this.putInside(bag.retrieve());
    }
    
    public int calculateTotalWeight() {
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
        
        GrainStorage other = (GrainStorage) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.grains.equals(other.grains) &&
                capacity == other.capacity;
    }
    
    @Override
    public int hashCode() {
        return 14 * Objects.hashCode(this.grains) + 3 * Objects.hashCode(this.capacity);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "[grains=" + grains.toString()
                + ",capacity=" + Integer.toString(capacity) + "]";
    }
}
