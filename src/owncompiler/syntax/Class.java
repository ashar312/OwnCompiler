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
    private boolean INH(){
        if(ToCheckIfTrue("extends")){
            index++;
            if(ToCheckIfTrue("ID")){
                index++;
                return true;
            }
        }
        else if(ToCheckIfTrue("{")){
            return true;
        }
        return false;
    }
    private boolean cbody(){
        if(checkkey.DT()){
            index++;
            if(cbody1()){
                return true;
            }
        }
        else if(ToCheckIfTrue("ID")){
            index++;
            if(cbody2()){
                return true;
            }
        }
        else if(checkkey.AM()){
            index++;
            if(cbody3()){
                return true;
            }
        }
        return false;
    }
    private boolean cbody2(){
        if(AOB()){
            return true;
        }
        else{
            if(ToCheckIfTrue("ID")){
                index++;
                if(obj_dec()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean cbody3(){
        if(ToCheckIfTrue("ID")){
            index++;
            if(ToCheckIfTrue("(")){
                index++;
                if(args()){
                    if(ToCheckIfTrue(")")){
                        index++;
                        if(ToCheckIfTrue("{")){
                            index++;
                            if(conbody()){
                                if(ToCheckIfTrue("}")){
                                    index++;
                                }
                            }
                        }
                    }
                }
            }
                
        }
        else{
            
        }
        return false;
    }
    private boolean cbody1(){
        
        return false;
    }
    private boolean list(){
        
        return false;
    }
    private boolean ADT(){
        
        return false;
    }
    
    
}
