/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import com.ssnagin.sem1lab3uml.interfaces.GrainCultureStorage;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DEVELOPER
 */
public class BreadStorage implements GrainCultureStorage {
    public List<Bread> bread;
    
    public BreadStorage() {
        
    }
    
    public void putInside(GrainCulture grainCulture) {
        
    }
    
    public void retrieve() {
        
    }
    
    @Override
    public boolean equals(Object otherObject) {
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        BreadStorage other = (BreadStorage) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.bread.equals(other.bread);
    }
    
    @Override
    public int hashCode() {
        return 3 * Objects.hashCode(this.bread);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "[bread="+bread+"]";
    }
}
