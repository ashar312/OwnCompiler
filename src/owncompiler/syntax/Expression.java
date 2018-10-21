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
public class Expression extends Syntax {
    
    public Expression(ArrayList<Token> tokenlist){
        super(tokenlist);
    }
    private boolean first(){
        
        return ToCheckIfTrue("ID") || checkkey.Constant() || ToCheckIfTrue("(");
    }
    
    public boolean OE(){
        if(first()){
            if(AE()){
                if(OEE()){
                }
            }
        }
        return false;
    }
    
    private boolean AE(){
        if(first())
        {
            if(BOE()){
                if(AEE()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean OEE(){
        if(ToCheckIfTrue("OR")){
            index++;
            if(AE()){
                if(OEE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue(")") || ToCheckIfTrue(";") || ToCheckIfTrue(",")){
            return true;
        }
        return false;
    }
    private boolean AEE(){
        if(ToCheckIfTrue("AND")){
            index++;
            if(BOE()){
                if(AEE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("||") || ToCheckIfTrue(";") || ToCheckIfTrue(",")){
            return true;
        }
        
        
        return false;
    }
    private boolean BOE(){
        if(first()){
            if(BXE()){
                if(BOEE()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean BOEE(){
        if(ToCheckIfTrue("|")){
            index++;
            if(BXE()){
                if(BOEE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("&&") || ToCheckIfTrue("||") || ToCheckIfTrue(";") || ToCheckIfTrue(",")){
                return true;
        }
        return false;
    }
    private boolean BXE(){
        if(first()){
            if(BAE()){
                if(BXEE()){
                    return true;
                }
            }
        }
        
        return false;
    }
    private boolean BXEE(){
        if(ToCheckIfTrue("^")){
            index++;
            if(BAE()){
                if(BXEE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("|") ||ToCheckIfTrue("&&") || ToCheckIfTrue("||") || ToCheckIfTrue(";") || ToCheckIfTrue(",")){
            return true;
        }
        return false;
    }
    private boolean BAE(){
    
        return false;
    }
    private boolean BAEE(){
    
        return false;
    }
    private boolean REE(){
    
        return false;
    }
    
    
    
    
    
    
}
