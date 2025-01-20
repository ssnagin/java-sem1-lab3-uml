/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.ssnagin.sem1lab3uml.exceptions;

/**
 *
 * @author DEVELOPER
 */
public class StorageOverflow extends Exception {

    /**
     * Creates a new instance of <code>StorageOwerflow</code> without detail
     * message.
     */
    public StorageOverflow() {}

    /**
     * Constructs an instance of <code>StorageOwerflow</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public StorageOverflow(String msg) {
        super(msg);
    }
    
    @Override
    public String getMessage() {
        return "Нельзя складывать столько вещей, иначе хранилище заполнится!";
    }
}
