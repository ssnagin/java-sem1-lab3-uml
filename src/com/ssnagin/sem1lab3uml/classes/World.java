/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.abstractClasses.CommunityPerson;
import com.ssnagin.sem1lab3uml.PrettyPrint;

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
                        "\\ \\ \\ \\ \\/\\      \\ \\ \\                  ������� UML ������ �����,",
                        " \\ \\ \\ \\ \\ \\ \\__\\ \\ \\ \\  __             ����, � �� ������ ������.",
                        "  \\ \\ \\_\\ \\ \\ \\_/\\ \\ \\ \\ \\ \\",
                        "   \\ \\_____\\ \\_\\\\ \\_\\ \\____/",
                        "    \\/_____/\\/_/ \\/_/\\/___/",
                        " "
                )
        );
    }
    
    public void runSimulation() {
        PrettyPrint.log("������� UML �������� ���� ����������� ���...", " ssngn");
        
        GrainStorage grainStorage = new GrainStorage();
        CommunityPerson community = new CommunityPerson();
        
        
    }
    
}
