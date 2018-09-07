/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler;

/**
 *
 * @author Ashar Ashfaq
 */
public class Token {
    
    String classpart;
    String valuepart;
    int line;

    public Token(String classpart, String valuepart, int line) {
        this.classpart = classpart;
        this.valuepart = valuepart;
        this.line = line;
    }
    
    
    
}
