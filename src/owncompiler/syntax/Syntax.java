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
   
    int index = 0;
    
    
    CheckKeys checkkey;
    ArrayList<Token> TokenList = new ArrayList<Token>();
    public Syntax(ArrayList<Token> tokenlist){
        this.TokenList = tokenlist;
        checkkey = new CheckKeys(tokenlist);
        
        
    }
    
    
    
    private boolean stat(){
        return ToCheckIfTrue("final") || ToCheckIfTrue("static");
    }
    
    private boolean return_type(){
            if(checkkey.DT()){
                return true;
            }
            else if(checkkey.ID()){
                return true;
            }
            else if(ToCheckIfTrue("void")){
                return true;
            }
        
        
        return false;
    }
    private boolean args(){
        if(ToCheckIfTrue("(")){
            index++;
            if(args1()){
                index++;
                if(args0()){
                    index+=2;
                }
            }
        }
            
        
        return false;
    }
    
    public boolean ToCheckIfTrue(String str){
        return this.TokenList.get(index).classPart.equals(str);
    }
    
    private boolean args1(){
        return ToCheckIfTrue("DT");
    }
    private boolean args0(){
       if(ToCheckIfTrue("[")){
           index++;
           if(ToCheckIfTrue("]")){
            index++;
            if(ToCheckIfTrue("ID")){
                index++;
                if(args2()){
                    
                }
            }
           }
       }
       else if(ToCheckIfTrue("ID")){
           index++;
           if(args2()){
               return true;
           }
       }
           
           
       
       return false;
    }
    private boolean args2(){
        if(ToCheckIfTrue(","))
        {
            index++;
            if(args1()){
                index++;
            }
        }
        else{
            return true;
        }
        return false;
    }
    
    private boolean body(){
        
        
        
        return false;
    }
    
    private boolean fn_call(){
        if(ToCheckIfTrue("ID")){
            index++;
            if(ToCheckIfTrue("(")){
            index++;
                if(para0())
                    {
            
                    }
        }
        
        
        }
        return false;
    }
    private boolean para0(){
        if(para()){
            
        }
        else if(ToCheckIfTrue(")")){
            index++;
            return true;
        }
        
        return false;
    }
    
    
    private boolean para(){
        if(ToCheckIfTrue("ID")){
            index++;
            if(para2()){
                return true;
            }
        }
        else if(checkkey.Constant()){
            index++;
            if(para2()){
                return true;
            }
        }
        
        return false;
    }
    
    private boolean para2(){
        if(ToCheckIfTrue(")")){
            index++;
            return true;
        }
        else if(ToCheckIfTrue(",")){
            index++;
            if(para()){
                return true;
            }
        }
        return false;
    }
    
    private boolean func_Dec(){
         
            if(checkkey.AM()){
                index++;
            }
            if(stat()){
                index++;
            }
            if(return_type()){
                index++;
                if(checkkey.ID()){
                    index++;
                        if(args()){
                            if(body()){
                                
                            }
                        }
                    
                }
            }
                
            
            return false;
        }
 
}

        
    
    
    

