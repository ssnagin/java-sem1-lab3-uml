/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;

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
}
