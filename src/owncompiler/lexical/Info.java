/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler.lexical;

import java.util.ArrayList;

/**
 *
 * @author Bismah Rasheed
 */


public class Info {

    public ArrayList<names> OperatorsList = new ArrayList<>();
    public ArrayList<names> KeywordsList = new ArrayList<>();
    public ArrayList<names> PunctuatorsList = new ArrayList<>();
    public Info()
    {
        
        
        //For Operators
        OperatorsList.add(new names("PM","+"));
        OperatorsList.add(new names("PM","-"));
        OperatorsList.add(new names("MDM","*"));
        OperatorsList.add(new names("MDM","/"));
        OperatorsList.add(new names("MDM","%"));
        
        OperatorsList.add(new names("=","="));
        OperatorsList.add(new names("?","?"));
        OperatorsList.add(new names("`","`"));
        OperatorsList.add(new names("#","#"));
        OperatorsList.add(new names("@","@"));
        OperatorsList.add(new names("AOP","+="));
        OperatorsList.add(new names("AOP","-="));
        OperatorsList.add(new names("AOP","*="));
        OperatorsList.add(new names("AOP","/="));
        OperatorsList.add(new names("AOP","<<="));
        OperatorsList.add(new names("AOP",">>="));
        
        OperatorsList.add(new names("Double Colon","::"));
        OperatorsList.add(new names("RO",">"));
        OperatorsList.add(new names("RO","<"));
        OperatorsList.add(new names("RO",">="));
        OperatorsList.add(new names("RO","<="));
        OperatorsList.add(new names("!=","!="));
        OperatorsList.add(new names("==","=="));
        OperatorsList.add(new names("ShOP",">>"));
        OperatorsList.add(new names("ShOP","<<")); 
        
        OperatorsList.add(new names("AND","&&"));
        OperatorsList.add(new names("OR","||"));
        OperatorsList.add(new names("!","!"));
        
        OperatorsList.add(new names("&","&"));
        OperatorsList.add(new names("!","|"));
        OperatorsList.add(new names("^","^"));
        OperatorsList.add(new names("IncDec","++"));
        OperatorsList.add(new names("IncDec","--"));
        
        
        // keywordslist         
        KeywordsList.add(new names("main","Main"));
        KeywordsList.add(new names("new","new"));
        KeywordsList.add(new names("abstract","hidden"));
        KeywordsList.add(new names("struct","Struct"));
        KeywordsList.add(new names("return","respondWith"));
        KeywordsList.add(new names("if","incase"));
        KeywordsList.add(new names("else","otherwise"));
        KeywordsList.add(new names("swtich","Change"));
        KeywordsList.add(new names("case","Event"));
        KeywordsList.add(new names("default","absence"));
        KeywordsList.add(new names("for","Consider"));
        KeywordsList.add(new names("While","asLongas"));
        KeywordsList.add(new names("do","carryout"));
        KeywordsList.add(new names("foreach","considerAll"));
        KeywordsList.add(new names("void","empty"));
        KeywordsList.add(new names("break","detract"));
        KeywordsList.add(new names("continue","carryOn"));
        KeywordsList.add(new names("true","right"));
        KeywordsList.add(new names("false","wrong"));
        KeywordsList.add(new names("extend","inherits"));
        KeywordsList.add(new names("this","points"));
        KeywordsList.add(new names("AM","accessible"));
        KeywordsList.add(new names("AM","closed"));
        KeywordsList.add(new names("AM","secured"));
        KeywordsList.add(new names("class","class"));
        KeywordsList.add(new names("final","fixed"));
        KeywordsList.add(new names("static","static"));
        KeywordsList.add(new names("null","none"));
        KeywordsList.add(new names("DT","Integer"));
        KeywordsList.add(new names("DT","decimal"));
        KeywordsList.add(new names("DT","char"));
        KeywordsList.add(new names("DT","String"));
        KeywordsList.add(new names("DT","bool"));
        //KeywordsList.add(new names("print","PrintLine"));
        
        
        //Punctuators
        PunctuatorsList.add(new names(".","."));
        PunctuatorsList.add(new names(";",";"));
        PunctuatorsList.add(new names(",",","));
        PunctuatorsList.add(new names("(","("));
        PunctuatorsList.add(new names(")",")"));
        PunctuatorsList.add(new names("{","{"));
        PunctuatorsList.add(new names("}","}"));
        PunctuatorsList.add(new names("[","["));
        PunctuatorsList.add(new names("]","]"));
        PunctuatorsList.add(new names(":",":"));
        PunctuatorsList.add(new names("\\","\\"));
        }
        }
        
    

    

