/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DEVELOPER
 */
public class Community {

    public List<CommunityPerson> memberList = new ArrayList<CommunityPerson>();

    public Community() {
        PrettyPrint.log("Успешно сформировалась", "ОБЩИНА");
    }

    public Community(List<CommunityPerson> people) {
        this();
        this.memberList.addAll(people);
    }

    public void addMember(CommunityPerson person) {
        PrettyPrint.log("Появился", person.name);
        this.memberList.add(person);
    }
    
    public void addMembers(List<CommunityPerson> person) {
        for (int i = 0; i < person.size(); i++) {
            addMember(person.get(i));
        }
    }

    public void removeMember(CommunityPerson person) {
        this.memberList.remove(person);
    }

    public void harvest(GrainStorage grainStorage) {
        PrettyPrint.log("Начала собирать урожай", "ОБЩИНА");
        
        Random random = new Random();
        
        List<GrainCulture> field = new ArrayList<GrainCulture>();

        for (int i = 0; i < memberList.size(); i++) {
            CommunityPerson person = memberList.get(i);
            GrainCulture randomGrain;
            
            switch (random.nextInt(2)) {
                case 0:
                    randomGrain = new Rice(10);
                    break;
                case 1:
                    randomGrain = new Barley(10);
                    break;
                default:
                    randomGrain = new Rice(10);
                    break;
            }
            
            field.add(person.plant(randomGrain));
        }
        PrettyPrint.log("ВСЁ ПОСАЖЕНО", "ПОЛЕ");
        for (int i = 0; i < field.size(); i++) {
            CommunityPerson person = memberList.get(i);
            GrainCulture grain = field.get(i);
            
            person.harvest(grain);
            
            grainStorage.putInside(person.bag);
        }
        
        PrettyPrint.log("Закончила собирать урожай в кол-ве " + grainStorage.calculateTotalWeight(), "ОБЩИНА");

    }

    public void doSomeWork() {
        PrettyPrint.log("Делают какую-то работу...", "ОБЩИНА");
    }
    
    public void makeBaskets() {
        PrettyPrint.log("Плетут корзины...", "ОБЩИНА");
        
        for (int i = 0; i < memberList.size(); i++) {
            CommunityPerson person = memberList.get(i);
            person.makeBaskets();
        }
    }

    public void getsupplyStatus(List<GrainCulture> grainCultures) {

    }
}
