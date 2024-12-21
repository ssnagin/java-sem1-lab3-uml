/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import com.ssnagin.sem1lab3uml.interfaces.Storable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEVELOPER
 */
public class GrainStorage implements Storable {
    
    public int capacity;
    public List<GrainCulture> grains = new ArrayList<GrainCulture>();
   
    @Override
    public void putInside() {
        
    }
    
    public int getSize() {
        return 0;
    }
    
    public void putInside(Bag bag) {
        this.grains.addAll(bag.retrieve());
    }
    
    public List<GrainCulture> retrieve() {
        return this.grains;
    }
    
    public GrainStorage(GrainCulture[] grainCultures) {
        
    }
    
    public GrainStorage() {
        
    }
    
    public void putInside(GrainCulture grainCulture) {
        
    }
    
    public void putInside(GrainCulture[] grainCulture) {
        
    }
    
    public int calculateTotalWeight() {
        int result = 0;
        for (int i = 0; i < grains.size(); i++) {
            result += grains.get(i).amount;
        }
        return result;
    }

}
