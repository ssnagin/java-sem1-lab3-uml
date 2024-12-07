/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import com.ssnagin.sem1lab3uml.enums.GrainStatus;

/**
 *
 * @author DEVELOPER
 */
public class Rice extends GrainCulture {
    
    public Rice(int amount) {
        super(amount);
    }
    
    @Override
    public void plant() {
        PrettyPrint.log("Посажен в количестве " + Integer.toString(amount) + 
                " штук. Однако рис рос на стероидах, поэтому:", "РИС");
        setStatus(GrainStatus.GROWED);
    }
        
    @Override
    public void harvest() {
        setStatus(GrainStatus.HARVESTED);
        this.amount = this.originalAmount * 2;
        PrettyPrint.log(
                "Собрал рис в количестве " + 
                Integer.toString(this.amount) + 
                " единиц!"
        );
    }
    
    @Override
    public void setStatus(GrainStatus status) {
        PrettyPrint.log("Поменяло статус на " + status.toString(), "РИС");
        this.status = status;
    }
}
