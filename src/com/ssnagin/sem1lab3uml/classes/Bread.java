/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssnagin.sem1lab3uml.classes;

import com.ssnagin.sem1lab3uml.PrettyPrint;
import com.ssnagin.sem1lab3uml.interfaces.Eatable;
import java.util.Objects;

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
        PrettyPrint.log("Испёкся", "ХЛЕБ");
    }
    
    @Override
    public boolean equals(Object otherObject) {
        // 0. Проверка объектов на идентичность
        if (this == otherObject) return true;
        
        // 1. Возвратить логическое значение false если null
        if (otherObject == null) return false;
        
        // 2. Классы не совпадают если они не равны
        if (getClass() != otherObject.getClass()) return false;
        
        Bread other = (Bread) otherObject;
        
        // Если классы совпадают, считаем, что объекты равны (нет полей)
        return true;
    }
    
    @Override
    public int hashCode() {
        return 262813375; // произвольное число тк нет полей
    }
    
    
    @Override
    public String toString() {
        return getClass().getName() + "[]"; // нет полей, возвращаем имя класса
    }
}
