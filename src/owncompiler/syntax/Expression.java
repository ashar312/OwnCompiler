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
        if(first()){
            if(REE()){
                if(BAEE()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean BAEE(){
        if(ToCheckIfTrue("&")){
            index++;
            if(REE()){
                if(BAEE()){
                    return true;
                }
            }
        }else if(ToCheckIfTrue("^") ||ToCheckIfTrue("|") || ToCheckIfTrue("&&") 
                || ToCheckIfTrue("||") || ToCheckIfTrue(";") || ToCheckIfTrue(","))
        {
            return true;
        }
        return false;
    }
    private boolean REE(){
        if(first()){
            if(RE1()){
                if(REEE()){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean RE1(){
        if(first()){
            if(shift_op()){
                if(REEE()){
                    return true;
                }
            }
        }
        
        return false;
    }
    private boolean RE1E(){
        if(ToCheckIfTrue("RO")){
            if(shift_op()){
                if(REEE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("==") || ToCheckIfTrue("!=") || ToCheckIfTrue("^") 
                || ToCheckIfTrue("|") || ToCheckIfTrue("&&") || ToCheckIfTrue("||") 
                || ToCheckIfTrue(";") || ToCheckIfTrue(",")){
            return true;
        }
            
        return false;
    }
    private boolean REEE(){
        if(ToCheckIfTrue("!=") || ToCheckIfTrue("==")){
            index++;
            if(RE1()){
                if(REEE()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean shift_op(){
        if(first()){
            if(E()){
                if(shift_op1()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean shift_op1(){
        if(ToCheckIfTrue("ShOP")){
            index++;
            if(E()){
                if(shift_op1()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("RO") || signs()){
            return true;
        }
        return false;
    }
    private boolean E(){
        if(first()){
            if(T()){
                if(EE()){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean EE(){
        if(ToCheckIfTrue("PM")){
            index++;
            if(T()){
                if(EE()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("ShOP") || ToCheckIfTrue("RO") || signs()){
            return true;
        }
        return false;
    }
    
    private boolean T(){
        if(first()){
            if(D()){
                if(TT()){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean D(){
        if(first()){
            if(F()){
                if(DD()){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean TT(){
        if(ToCheckIfTrue("MDM")){
            index++;
            if(D()){
                if(TT()){
                    return true;
                }
            }
        }
        else if(ToCheckIfTrue("PM") || ToCheckIfTrue("ShOP") || ToCheckIfTrue("RO") || signs()){
            return true;
        }
        return false;
    }
    private boolean DD(){
        if(ToCheckIfTrue("IncDec")){
            index++;
        }
        else if(ToCheckIfTrue("MDM") || ToCheckIfTrue("PM") || ToCheckIfTrue("ShOP") || ToCheckIfTrue("RO") || signs()){
            
        }
        return false;
    }
    private boolean F(){
        if(first()){
            
        }
        return false;
    }
    private boolean FF(){
        
        return false;
    }
    private boolean FFF(){
        
        return false;
    }
    
    
    
    
    private boolean signs(){
       return  ToCheckIfTrue("==") || ToCheckIfTrue("!=") || ToCheckIfTrue("^") 
                || ToCheckIfTrue("|") || ToCheckIfTrue("&&") || ToCheckIfTrue("||") 
                || ToCheckIfTrue(";") || ToCheckIfTrue(",");
    }
    
}
