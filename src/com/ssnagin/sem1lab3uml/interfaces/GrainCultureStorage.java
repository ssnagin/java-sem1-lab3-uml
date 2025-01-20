/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ssnagin.sem1lab3uml.interfaces;

import com.ssnagin.sem1lab3uml.abstractClasses.GrainCulture;
import com.ssnagin.sem1lab3uml.exceptions.StorageOverflow;

/**
 *
 * @author DEVELOPER
 */
public interface GrainCultureStorage {
    public void putInside(GrainCulture grainCulture) throws StorageOverflow;
}