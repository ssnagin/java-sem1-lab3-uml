/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.abstractClasses;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.enums.GrainStatus;
import com.ssnagin.sem1lab3uml.interfaces.Harvestable;
import com.ssnagin.sem1lab3uml.interfaces.Plantable;
import java.util.Objects;


/**
 *
 * @author DEVELOPER
 */
public abstract class GrainCulture implements Harvestable, Plantable {
    public int amount;
    public int originalAmount;
    
    protected GrainStatus status;
    
    public abstract void harvest();
    
    public abstract void plant();
    
    public GrainCulture(int originalAmount) {
        this.amount = 0;
        this.originalAmount = originalAmount;
        
        setStatus(GrainStatus.NOT_PLANTED);
    }
    
    public void setStatus(GrainStatus status) {
        PrettyPrint.log("Изменило статус на " + status.toString(), "ЗК");
        this.status = status;
    }
    public GrainStatus getStatus() {
        return this.status;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        GrainCulture other = (GrainCulture) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.amount == other.amount &&
                this.originalAmount == other.originalAmount &&
                this.status.equals(other.status);
    }
        
    @Override
    public int hashCode() {
        return 4 * Objects.hashCode(this.amount) +
                3 * Objects.hashCode(this.originalAmount) + 
                2 * Objects.hashCode(this.status);
//        return Objects.hash(this.amount, this.originalAmount, this.status);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "[amount=" + Integer.toString(amount)
                + ",originalAmount=" + Integer.toString(originalAmount)
                + "grainStatus=" + status.toString()
                + "]";
    }
}
