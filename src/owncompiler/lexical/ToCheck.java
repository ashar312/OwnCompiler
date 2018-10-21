/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler.lexical;

import java.util.ArrayList;

/**
 *
 * @author Ashar Ashfaq
 */
public class ToCheck {
    
   
    //after line breaker function
    Token token;
    
    ArrayList<Token> tokenlist = new ArrayList<>();
    
    //yahan per saray words check hungy aur token may jaky print hungy 
    
    public ToCheck(String str,int lineNumber)
    {
        if("main".equals(str))
        {
            token = new Token("main",str,lineNumber);
            System.out.println(token);
            tokenlist.add(token);
        }
        
        
    }
    
   
}
