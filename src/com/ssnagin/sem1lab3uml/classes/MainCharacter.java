/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import java.util.Objects;

/**
 *
 * @author DEVELOPER
 */
public class MainCharacter extends CommunityPerson {
    public boolean pletnyNeed = false;
    
    public MainCharacter(String name) {
        super(name);
    }
    
    public boolean getPletnyNeed() {
        return this.pletnyNeed;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        MainCharacter other = (MainCharacter) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.name.equals(other.name) &&
                this.bag.equals(other.bag) &&
                this.pletnyNeed == other.pletnyNeed;
    }
    
    @Override
    public int hashCode() {
        return 14 * Objects.hashCode(this.name) + 
                3 * Objects.hashCode(this.bag) +
                2 * Objects.hashCode(this.pletnyNeed);
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "[pletnyNeed=" + Boolean.toString(pletnyNeed) + "]";
    }
}
