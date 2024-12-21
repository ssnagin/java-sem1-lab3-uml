/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEVELOPER
 */
public class Bag {
    public List<GrainCulture> grains;
    public int capacity;
    
    public Bag(int capacity) {
        this.capacity = capacity;
        this.grains = new ArrayList<GrainCulture>();
    }
    
    public void putInside(GrainCulture grainCulture) {
        this.grains.add(grainCulture);
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
}
