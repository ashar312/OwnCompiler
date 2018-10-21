/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler.syntax;

import java.util.ArrayList;
import owncompiler.lexical.Token;


public class CheckKeys extends Syntax {
    
    String[] constant;
    public CheckKeys(ArrayList<Token> tokenlist) {
        super(tokenlist);
        constant = new String[5];
        constant[0] = "Integer Constant";
        constant[1] = "Char Constant";
        constant[2] = "string Constant";
        constant[3] = "Boolean Constant";
        constant[4] = "float Constant";
        
    }

    public boolean DT(){
        return this.TokenList.get(index).classPart.equals("DT");
        
    }
    
    public boolean AM(){
        return this.TokenList.get(index).classPart.equals("AM");
    }
    public boolean ID(){
        return this.TokenList.get(index).classPart.equals("ID");
    }
    public boolean Constant(){
        for (String constant1 : constant) {
            return this.TokenList.get(index).classPart.equals(constant1);
        }
        return false;
    }
       


}
