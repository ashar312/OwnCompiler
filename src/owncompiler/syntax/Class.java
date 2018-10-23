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
public class Class extends Syntax {
    
    public Class(ArrayList<Token> tokenlist) {
        super(tokenlist);
    
    }
    
    public boolean cclass(){
        if(checkkey.AM()){
            index++;
            if(class1()){
                return true;
            }
        }
        return false;
    }
    
    private boolean class1(){
        if(ToCheckIfTrue("class")){
            index++;
            if(checkkey.ID()){
                index++;
                if(INH()){
                    if(ToCheckIfTrue("{")){
                        index++;
                        if(cbody()){
                            if(main()){
                                if(cbody()){
                                    if(ToCheckIfTrue("}")){
                                        index++;
                                        if(class_def()){
                                            index++;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else if(ToCheckIfTrue("abstract")){
            index++;
            if(ToCheckIfTrue("class")){
                index++;
                if(checkkey.ID()){
                    index++;
                    if(INH()){
                        if(ToCheckIfTrue("{")){
                            index++;
                            if(abs_body()){
                                if(class_def()){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    private boolean class_def(){
        if(ToCheckIfTrue("class")){
            index++;
            if(checkkey.ID()){
                index++;
                if(INH()){
                    if(ToCheckIfTrue("{")){
                        index++;
                        if(cbody()){
                            
                        }
                    }
                }
            }
            
        }
        return false;
    }
    private boolean class1(){
        
        return false;
    }
    private boolean class1(){
        
        return false;
    }
    private boolean class1(){
        
        return false;
    }
    private boolean class1(){
        
        return false;
    }
    
    
}
