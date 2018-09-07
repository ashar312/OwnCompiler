/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler;

import java.util.ArrayList;

/**
 *
 * @author Ashar Ashfaq
 */


public class Info {

    public Info()
    {
        ArrayList<names> OperatorsList = new ArrayList<names>();
        
        //For Operators
        OperatorsList.add(new names("arithmatic operator","+"));
        OperatorsList.add(new names("arithmatic operator","-"));
        OperatorsList.add(new names("arithmatic operator","*"));
        OperatorsList.add(new names("arithmatic operator","/"));
        OperatorsList.add(new names("arithmatic operators","%"));
        
        OperatorsList.add(new names("assignment operators","="));
        OperatorsList.add(new names("assignment operators","+="));
        OperatorsList.add(new names("assignment operators","-="));
        OperatorsList.add(new names("assignment operators","*="));
        OperatorsList.add(new names("assignment operators","/="));
        
        OperatorsList.add(new names("relational operators",">"));
        OperatorsList.add(new names("relational operators","<"));
        OperatorsList.add(new names("relational operators",">="));
        OperatorsList.add(new names("relational operators","<="));
        OperatorsList.add(new names("relational operators","!="));
        OperatorsList.add(new names("relational operators","=="));
        
        OperatorsList.add(new names("logical operators","&&"));
        OperatorsList.add(new names("relational operators","||"));
        OperatorsList.add(new names("relational operators","!"));
        
        OperatorsList.add(new names("bitwise operators","&"));
        OperatorsList.add(new names("bitwise operators","|"));
        
        
        
        // keywordslist may if ka incase likha hai menay ab dheklena ya toa if ki jaga condition likhdo ya if hee 
        // rehny do UP TO YOU.....
        
        ArrayList<names> KeywordsList = new ArrayList<names>();
        KeywordsList.add(new names("if","incase"));
        KeywordsList.add(new names("else","otherwise"));
        KeywordsList.add(new names("swtich","change"));
        KeywordsList.add(new names("case","Event"));
        KeywordsList.add(new names("default","absense"));
        KeywordsList.add(new names("for","Consider"));
        KeywordsList.add(new names("While","aslongas"));
        KeywordsList.add(new names("do","carryout"));
        KeywordsList.add(new names("foreach","considerall"));
        KeywordsList.add(new names("Void","Empty"));
        KeywordsList.add(new names("break","detract"));
        KeywordsList.add(new names("continue","carryone"));
        KeywordsList.add(new names("true","right"));
        KeywordsList.add(new names("false","wrong"));
        KeywordsList.add(new names("extend","inherits"));
        KeywordsList.add(new names("this","points"));
        KeywordsList.add(new names("public","accessible"));
        KeywordsList.add(new names("private","closed"));
        KeywordsList.add(new names("protected","secured"));
        KeywordsList.add(new names("class","class"));
        KeywordsList.add(new names("final","fixed"));
        KeywordsList.add(new names("static","static"));
        KeywordsList.add(new names("null","none"));
        KeywordsList.add(new names("Int","Int"));
        KeywordsList.add(new names("float","float"));
        KeywordsList.add(new names("char","char"));
        KeywordsList.add(new names("String","String"));
        KeywordsList.add(new names("boolean","boolean"));
        
        
        
        ArrayList<names> PunctatorsList = new ArrayList<names>();
        PunctatorsList.add(new names("Dot","."));
        PunctatorsList.add(new names("Endpunctuator",";"));
        PunctatorsList.add(new names("Comma",","));
        PunctatorsList.add(new names("Open bracket","("));
        PunctatorsList.add(new names("Close bracket",")"));
        PunctatorsList.add(new names("Open Curly Bracket","{"));
        PunctatorsList.add(new names("Close Curly Bracket","}"));
        
                
        
                
                
                
                
    }

    
}
