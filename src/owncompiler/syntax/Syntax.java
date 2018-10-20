/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler.syntax;
import java.util.ArrayList;
import owncompiler.lexical.Token;
/**
 *
 * @author Ashar Ashfaq
 */
public class Syntax {
   
    
    
    ArrayList<Token> TokenList = new ArrayList<Token>();
    public Syntax(ArrayList<Token> tokenlist){
        this.TokenList = tokenlist;
        System.out.println("adhasdhadh");
        System.out.println(""+this.TokenList.get(3).valuePart);
        
    }
    
    private void AM(){
        String[] AM = new String[3];
        AM[0] = "public";
        AM[1] = "private";
        AM[2] = "protected";
        
        
        
    }
    
    
    
}
