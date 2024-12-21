/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;

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
        PrettyPrint.log("Какой же ты, " + person.name + ", плохой, аяяй!", "ИСПАНЕЦ");
    }
    
    @Override
    public void makeBaskets() {
        PrettyPrint.log("Делает какие-то карзиночки...", this.name);
        harrasPerson(personToHarras);
    }
    
}
