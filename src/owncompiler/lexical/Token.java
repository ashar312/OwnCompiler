/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler.lexical;

/**
 *
 * @author Bismah Rasheed
 */
public class Token {
    
    public String classPart;
    public String valuePart;
    public int lineNumber;
    Token[] token=new Token[10];
    

    public Token()
    {
        
    }
    
    public Token(String classpart, String valuepart, int line) {
        this.classPart = classpart;
        this.valuePart = valuepart;
        this.lineNumber = line;
        if(this.lineNumber==1)
        {
            
        }
        
        String word="";
        switch(word)
        {
            case "abc" :   toString();
        }
        
            
        
    }
   
    
   @Override
    public String toString() {
        return "\nClass Part: " +classPart+ "Value Part:" + valuePart + ", Line Number:" + lineNumber;
    }
    
    
}
