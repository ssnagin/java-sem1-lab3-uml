/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.abstractClasses;

import com.ssnagin.sem1lab3uml.classes.Bag;
import com.ssnagin.sem1lab3uml.PrettyPrint;

/**
 *
 * @author DEVELOPER
 */
public abstract class CommunityPerson {
    public String name;
    public Bag bag;
    
    public CommunityPerson(String name) {
        bag = new Bag(9999999);
        this.name = name;
    }
    
    public CommunityPerson(String name, Bag bag) {
        this(name);
    }
    
    public void harvest(GrainCulture grain) {
        grain.harvest();
        
        bag.putInside(grain);
    }
    
    public void makeBaskets() {
        PrettyPrint.log("Делает какие-то карзиночки...", this.name);
    }
    
    public void doSomeWork() {
        PrettyPrint.log("Делает какую-то работу...", this.name);
    }
    
    public GrainCulture plant(GrainCulture grainCulture) {
        PrettyPrint.log("Сажает культуру", this.name);
        grainCulture.plant();
        return grainCulture;
    }
    
}