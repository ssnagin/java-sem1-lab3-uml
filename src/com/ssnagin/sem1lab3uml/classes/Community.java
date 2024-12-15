/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import java.util.List;

/**
 *
 * @author DEVELOPER
 */
public class Community {

    public List<CommunityPerson> memberList;

    public Community() {
        PrettyPrint.log("Успешно сформировалась", "ОБЩИНА");
    }

    public Community(List<CommunityPerson> people) {
//        this.memberList = people;
        this();
    }

    public void addMember(CommunityPerson person) {
        this.memberList.add(person);
    }

    public void removeMember(CommunityPerson person) {
        this.memberList.remove(person);
    }

    public void harvest(GrainStorage grainStorage) {
        PrettyPrint.log("Начала собирать урожай", "ОБЩИНА");

        // ....
        PrettyPrint.log("Закончила собирать урожай", "ОБЩИНА");

    }

    public void doSomeWork() {
        PrettyPrint.log("Делают какую-то работу...", "ОБЩИНА");
    }

    public void getsupplyStatus(List<GrainCulture> grainCultures) {

    }
}
