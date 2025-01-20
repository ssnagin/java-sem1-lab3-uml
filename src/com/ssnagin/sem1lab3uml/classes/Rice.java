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
    
    public final String NAME = "РИС";
    
    public Rice(int amount) {
        super(amount);
    }
    
    @Override
    public void plant() {
        PrettyPrint.log("Был посажен в количестве " + Integer.toString(originalAmount) + 
                "", this.NAME);
        setStatus(GrainStatus.GROWED);
        
    }
        
    @Override
    public void harvest() {
        setStatus(GrainStatus.HARVESTED);
        this.amount = this.originalAmount * 10;
        PrettyPrint.log(
                "Партия гордится вами! +" + 
                Integer.toString(this.amount) + 
                " собрано!", NAME
        );
    }
    
    @Override
    public void setStatus(GrainStatus status) {
        PrettyPrint.log("Решил изменить свой статус на " + status.toString(), NAME);
        this.status = status;
    }
}
