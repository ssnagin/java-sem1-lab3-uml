/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DEVELOPER
 */
public class SpannishDude extends CommunityPerson {
    
    public CommunityPerson personToHarras;
    
    public SpannishDude(String name, CommunityPerson person) {
        super(name);
        personToHarras = person;
    }
    
    public void harrasPerson(CommunityPerson person) {
        if (person == null) {
            throw new IllegalArgumentException("Person не может быть null");
        }
        PrettyPrint.log("Какой же ты, " + person.name + ", плохой, аяяй!", "ИСПАНЕЦ");
    }
    
    @Override
    public List<Basket> makeBaskets() {
        harrasPerson(personToHarras);
        return super.makeBaskets();
    }
    
    @Override
    public boolean equals(Object otherObject) {
        
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        SpannishDude other = (SpannishDude) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.name.equals(other.name) &&
                this.bag.equals(other.bag) &&
                this.personToHarras.equals(other.personToHarras);
    }
    
    @Override
    public int hashCode() {
        return 14 * Objects.hashCode(this.name) + 
                3 * Objects.hashCode(this.bag) +
                2 * Objects.hashCode(this.personToHarras);
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ",personToHarras=" + personToHarras.toString() + "]";
    }
}
