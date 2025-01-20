/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.abstractClasses;

import com.ssnagin.sem1lab3uml.classes.Bag;
import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.classes.Basket;
import com.ssnagin.sem1lab3uml.exceptions.StorageOverflow;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author DEVELOPER
 */
public abstract class CommunityPerson {
    public String name;
    public Bag bag;
    
    public CommunityPerson(String name) { 
        this(name, new Bag(new Random().nextInt(255) + 1));
    }
    
    public CommunityPerson(String name, Bag bag) {
        this.name = name;
        this.bag = bag;
    }
    
    public CommunityPerson(String name, int bagCapacity) {
        this(name, new Bag(bagCapacity));
    }
    
    public void harvest(GrainCulture grain) {
        try {
            grain.harvest();
            bag.putInside(grain);
        } catch (StorageOverflow storageOverflow) {
            PrettyPrint.log(
                    "Слишком много урожая надо было взять, поэтому чел просто забил на него! ("
                            + storageOverflow + ")", this.name);
        }
        
    }
    
    public List<Basket> makeBaskets() {
        
        int randomNumber = new Random().nextInt(3) + 1;

        PrettyPrint.log(String.format(
                "Сделал какие-то карзиночки в количестве %d шт.", 
                randomNumber), 
                this.name);
        
        List<Basket> baskets = new ArrayList<Basket>();
        
        for (int i = 0; i < randomNumber; i++) {
            baskets.add(new Basket());
        }
        
        return baskets;
    }
    
    public void doSomeWork() {
        PrettyPrint.log("Делает какую-то работу...", this.name);
    }
    
    public GrainCulture plant(GrainCulture grainCulture) {
        PrettyPrint.log("Сажает культуру", this.name);
        grainCulture.plant();
        return grainCulture;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        CommunityPerson other = (CommunityPerson) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.name.equals(other.name) &&
                this.bag.equals(other.bag);
    }
    
    @Override
    public int hashCode() {
        return 13 * Objects.hashCode(this.name) + 5 * Objects.hashCode(this.bag);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "[name="+name
                + ",bag="+ bag.toString()
                + "]";
    }
}