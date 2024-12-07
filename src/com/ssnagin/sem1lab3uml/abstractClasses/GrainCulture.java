/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.abstractClasses;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.enums.GrainStatus;
import com.ssnagin.sem1lab3uml.interfaces.Harvestable;
import com.ssnagin.sem1lab3uml.interfaces.Plantable;


/**
 *
 * @author DEVELOPER
 */
public abstract class GrainCulture implements Harvestable, Plantable {
    public int amount;
    public int originalAmount;
    
    public GrainStatus status;
    
    public abstract void harvest();
    
    public abstract void plant();
    
    public GrainCulture(int originalAmount) {
        this.amount = 0;
        this.originalAmount = originalAmount;
        
        setStatus(GrainStatus.NOT_PLANTED);
    }
    
    public void setStatus(GrainStatus status) {
        PrettyPrint.log("Поменяло статус на " + status.toString(), "ЗЕРНО");
        this.status = status;
    }
    public GrainStatus getStatus() {
        return this.status;
    }
}
