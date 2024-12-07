/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.ssnagin.sem1lab3uml.exceptions;

/**
 *
 * @author DEVELOPER
 */
public class StorageOwerflow extends Exception {

    /**
     * Creates a new instance of <code>StorageOwerflow</code> without detail
     * message.
     */
    public StorageOwerflow() {
    }

    /**
     * Constructs an instance of <code>StorageOwerflow</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public StorageOwerflow(String msg) {
        super(msg);
    }
}
