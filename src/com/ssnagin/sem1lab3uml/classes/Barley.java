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
public class Barley extends GrainCulture {
    
    public final String NAME = "ЯЧМЕНЬ";

    
    public Barley(int amount) {
        super(amount);
    }
    
    @Override
    public void plant() {
        PrettyPrint.log("Посажен (" + Integer.toString(this.originalAmount) + ")", "Ячмень");
        setStatus(GrainStatus.GROWED);
    }
    
    @Override
    public void harvest() {
        setStatus(GrainStatus.HARVESTED);
        this.amount = this.originalAmount * 10;
        PrettyPrint.log(
                "С поля собрано " + 
                Integer.toString(this.amount) + 
                " ячменя!", NAME
        );
    }
    
    @Override
    public void setStatus(GrainStatus status) {
        PrettyPrint.log("Изменило статус на " + status.toString(), NAME);
        this.status = status;
    }
}
