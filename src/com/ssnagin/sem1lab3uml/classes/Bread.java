/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.interfaces.Eatable;

/**
 *
 * @author DEVELOPER
 */
public class Bread implements Eatable {
    @Override
    public void make() {
        this.bake();
    }
    
    private void bake() {
        
    }
}
