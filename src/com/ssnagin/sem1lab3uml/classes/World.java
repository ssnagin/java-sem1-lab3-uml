/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import com.ssnagin.sem1lab3uml.PrettyPrint;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer
 */
public class World {
    
    public World() {
        PrettyPrint.print(
                String.join(
                        System.getProperty("line.separator"),
                        " __  __           __ ",
                        "/\\ \\/\\ \\  /'\\_/`\\/\\ \\ ",
                        "\\ \\ \\ \\ \\/\\      \\ \\ \\                  Господь UML создал землю,",
                        " \\ \\ \\ \\ \\ \\ \\__\\ \\ \\ \\  __             воду, и всё вокруг короче.",
                        "  \\ \\ \\_\\ \\ \\ \\_/\\ \\ \\ \\ \\ \\",
                        "   \\ \\_____\\ \\_\\\\ \\_\\ \\____/",
                        "    \\/_____/\\/_/ \\/_/\\/___/",
                        " "
                )
        );
    }
    
    public void runSimulation() {
        PrettyPrint.log("Господь UML запустил этот совершенный мир...", " ssngn");
        
        GrainStorage grainStorage = new GrainStorage();
        
        // Подготовим наших жильцов:
        
        List<CommunityPerson> people = new ArrayList<>();

        CommunityPerson me = new MainCharacter("Ггерой");
        
        people.add(me); // я
        people.add(new SpannishDude("ИспанеЦ", me)); // испанец
        
        for (int i = 0; i < 13; i++) {
            people.add(new Member("Чел " + Integer.toString(i + 1)));
        }
        
        Community community = new Community(people);
        
        community.doSomeWork();
        
        // Собираем урожай:
        community.harvest(grainStorage);

        community.makeBaskets();
        
        PrettyPrint.log("Господь решил, что пока что хватит людишек на сегодня...", "ssngn");
    }
    
}
