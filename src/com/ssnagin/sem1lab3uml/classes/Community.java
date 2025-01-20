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
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author DEVELOPER
 */
public class Community {

    public List<CommunityPerson> memberList = new ArrayList<CommunityPerson>();

    public Community() {
        this(null);
    }

    public Community(List<CommunityPerson> people) {
        if (people != null) {
            this.addMembers(people);
        }
        
        PrettyPrint.log("Успешно сформировалась", "ОБЩИНА");
    }

    public void addMember(CommunityPerson person) {
        PrettyPrint.log("Появился с сумкой на " + 
        Integer.toString(person.bag.getCapacity()) + 
        " ед. емкости", person.name);
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
    
    @Override
    public boolean equals(Object otherObject) {
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        Community other = (Community) otherObject;
        
        // 3. Проверка на одинаковые значения
        return this.memberList.equals(other.memberList);
    }
    
    @Override
    public int hashCode() {
        return 8 * Objects.hashCode(this.memberList);
    }
    
    @Override
    public String toString() {
        return getClass().getName()
                + "[memberList="+memberList.toString()
                + "]";
    }
    
}
