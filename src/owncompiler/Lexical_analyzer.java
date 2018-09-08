/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

/**
 *
 * @author Bisma Rasheed
 */
public class Lexical_analyzer {
    
    
    String text = "";
    Token token=new Token();    
    ArrayList<Token> tokenlist = new ArrayList<>();
    char[] charArray = new char[text.length()];
    
    
    public Lexical_analyzer()
    {
        this.token.lineNumber=0;
        ReadFromTextFile(text);
        System.out.println("");
    }
    
    private void ReadFromTextFile(String text)
    {
        int linecounter=1;
        try {
            File file = new File("C:\\Users\\Ashar Ashfaq\\Desktop\\toread.txt");
            StringBuffer stringBuffer;
            try (FileReader fileReader = new FileReader(file)) 
            {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) 
                {
                    int tempcount=0;
                    charArray = line.toCharArray();
                    token.lineNumber = linecounter;
                    wordSeperator();
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                    linecounter++;
                }
            }
            text = stringBuffer.toString();
            System.out.println(text.length());
            charArray = text.toCharArray();
            System.out.println(charArray[15]);
           
            } 
            catch (IOException e) 
            {
                System.out.println(e);
            }
        //wordSeperator();
    }
    
    
    
    public void wordSeperator()
    {
        String word="";
        
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]!=' ' && charArray[i]!= ';' && charArray[i]!= '(' && charArray[i]!= ')' && charArray[i]!= '{' &&
            charArray[i]!= '}' && charArray[i]!='[' && charArray[i]!= ']' && charArray[i]!= '~' && charArray[i]!= '`' 
            && charArray[i]!= '^' && charArray[i]!= '&' && charArray[i]!= '\\' && charArray[i]!= ':' && charArray[i]!= ','
            && charArray[i]!= '<' && charArray[i]!= '!' && charArray[i]!= '+' && charArray[i]!= '-' && charArray[i]!= '>'
            && charArray[i]!= '/' && charArray[i]!= '*' && charArray[i]!= '%' && charArray[i]!= '=' && charArray[i]!='.')
            {
                word=word+charArray[i];
                if(i==charArray.length-1)
                {
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                }
            }
            
            else if(charArray[i]=='=')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='!')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='+')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=' || charArray[i+1]=='+')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='-')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=' || charArray[i+1]=='-')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='>')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=' || charArray[i+1]=='>')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='/')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=' || charArray[i+1]=='*' || charArray[i+1]=='/')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            
            
            else if(charArray[i]=='<')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='<' || charArray[i+1]=='=')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='*')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            else if(charArray[i]=='%')
            {
                if("".equals(word))
                {
                if(charArray[i+1]=='=')
                {
                    word=word+charArray[i];
                    word=word+charArray[i+1];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                    i++;
                }
                else
                {
                    word=word+charArray[i];
                    Tokenization(word,token.lineNumber);
                    System.out.println(word);
                    word="";
                }
                }
                else
                {
                   Tokenization(word,token.lineNumber);
                   System.out.println(word);
                   word="";
                   i--;
                }
            }
            
            
            else
            {
                //lastPointer=lastPointer+firstPointer;
                Tokenization(word,token.lineNumber);
                if(word!="")
                {
                    System.out.println(word);
                }
                word="";
                if(charArray[i]==' ')
                {
                    continue;
                }
                else if(charArray[i] == ';' || charArray[i] == '(' || charArray[i]== ')' || charArray[i]== '{' ||
            charArray[i]== '}' || charArray[i]=='[' || charArray[i]== ']' || charArray[i]== '~' || charArray[i]== '`' 
            || charArray[i]== '^' || charArray[i]== '&' || charArray[i]== '\\' || charArray[i]== ':' || charArray[i]== ','
            || charArray[i]== '<' || charArray[i]== '!' || charArray[i]== '+' || charArray[i]== '-' || charArray[i]== '>'
            || charArray[i]== '/' || charArray[i]== '*' || charArray[i]== '%' || charArray[i]== '=' || charArray[i]=='.')
                {
                    
                   // i--;
                    Tokenization(Character.toString(charArray[i]),token.lineNumber);
                    
                }
            }
        }
    }
    
    
    public void Tokenization(String value,int lineNumber)
    {
//        if("main".equals(value))
//        {
//            token = new Token("main",value,lineNumber);
//            //System.out.println(token);
//            tokenlist.add(token);
//        }
        
        if(value.length() <= 2)
        {
            switch(value)
            {
                case "+=":
                    token = new Token("Assignment operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "-=":
                    token = new Token("Assignment operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "*=":
                    token = new Token("Assignment operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "/=":
                    token = new Token("Assignment operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "=":
                    token = new Token("Assignment operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "+":
                    token = new Token("Arithmatic operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "-":
                    token = new Token("Arithmatic operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "*":
                    token = new Token("Arithmatic operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "/":
                    token = new Token("Arithmatic operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "%":
                    token = new Token("Arithmatic operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case ">":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "<":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "<=":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case ">=":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "!=":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "==":
                    token = new Token("Relational operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "&&":
                    token = new Token("Logical operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "||":
                    token = new Token("Logical operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "!":
                    token = new Token("Logical operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "&":
                    token = new Token("bitwise operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "|":
                    token = new Token("bitwise operator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                    
                //for punctuators
                case ".":
                    token = new Token("Dot",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case ";":
                    token = new Token("Endpunctuator",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case ",":
                    token = new Token("Comma",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "(":
                    token = new Token("Open bracket",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case ")":
                    token = new Token("Close bracket",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "{":
                    token = new Token("Open Curly Bracket",value,lineNumber);
                    tokenlist.add(token);
                    break;
                case "}":
                    token = new Token("Close Curly Bracket",value,lineNumber);
                    tokenlist.add(token);
                    break;
                    
                    
            }
        }
        else
        {
            // saray keywords
        switch(value)
        {
            case "main":
                token = new Token("main",value,lineNumber);
                tokenlist.add(token);
                break;
            case "empty":
                token = new Token("void",value,lineNumber);
                tokenlist.add(token);
                break;
            case "incase":
                token = new Token("ifcondition",value,lineNumber);
                tokenlist.add(token);
                break;
            case "otherwise":
                token = new Token("elsecondition",value,lineNumber);
                tokenlist.add(token);
                break;
            case "change":
                token = new Token("switch",value,lineNumber);
                tokenlist.add(token);
                break;
            case "event":
                token = new Token("case",value,lineNumber);
                tokenlist.add(token);
                break;
            case "absense":
                token = new Token("default",value,lineNumber);
                tokenlist.add(token);
                break;
            case "consider":
                token = new Token("for",value,lineNumber);
                tokenlist.add(token);
                break;
            case "aslongas":
                token = new Token("while",value,lineNumber);
                tokenlist.add(token);
                break;
            case "carryout":
                token = new Token("do",value,lineNumber);
                tokenlist.add(token);
                break;
            case "considerall":
                token = new Token("foreach",value,lineNumber);
                tokenlist.add(token);
                break;
            case "detract":
                token = new Token("break",value,lineNumber);
                tokenlist.add(token);
                break;
            case "carryon":
                token = new Token("continue",value,lineNumber);
                tokenlist.add(token);
                break;
            case "right":
                token = new Token("true",value,lineNumber);
                tokenlist.add(token);
                break;
            case "wrong":
                token = new Token("false",value,lineNumber);
                tokenlist.add(token);
                break;
            case "inherits":
                token = new Token("extends",value,lineNumber);
                tokenlist.add(token);
                break;
            case "points":
                token = new Token("this",value,lineNumber);
                tokenlist.add(token);
                break;
            case "accessible":
                token = new Token("access modifier",value,lineNumber);
                tokenlist.add(token);
                break;
            case "closed":
                token = new Token("access modifier",value,lineNumber);
                tokenlist.add(token);
                break;
            case "secured":
                token = new Token("access modifier",value,lineNumber);
                tokenlist.add(token);
                break;
            case "class":
                token = new Token("class",value,lineNumber);
                tokenlist.add(token);
                break;
            case "fixed":
                token = new Token("final",value,lineNumber);
                tokenlist.add(token);
                break;
            case "static":
                token = new Token("static",value,lineNumber);
                tokenlist.add(token);
                break;
            case "none":
                token = new Token("null",value,lineNumber);
                tokenlist.add(token);
                break;
            case "int":
                token = new Token("DataType",value,lineNumber);
                tokenlist.add(token);
                break;
            case "float":
                token = new Token("DataType",value,lineNumber);
                tokenlist.add(token);
                break;
            case "char":
                token = new Token("DataType",value,lineNumber);
               tokenlist.add(token);
                break;
            case "String":
                token = new Token("DataType",value,lineNumber);
                tokenlist.add(token);
                break;
            case "Boolean":
                token = new Token("DataType",value,lineNumber);
                tokenlist.add(token);
                break;
            default:
                break;
        }
        }
        
        
        
        
        
        
        
    }
    
    
    private boolean ToTestDataTypes(String s)
    {
        String[] substring = new String[3];
        substring[0] = "[+=:;'/><,!@#$%^&*()]|";
        substring[1] = "((\\\\n)|(\\\\r)|(\\\\t)|(\\\\b))|";
        substring[2] = "\'|\\\"";
        
        testregex[] test = new testregex[5]; //  
        test[0] = new testregex("ID","_([a-zA-Z0-9])+|[a-zA-Z][a-zA-Z0-9]*");
        test[1] = new testregex("Integer","[+-]?[0-9]+");
        test[2] = new testregex("Float","[+-]?[0-9]*[.][0-9]+((e|E)([+-]?)[0-9]+)?");
        test[3] = new testregex("Character","\'([a-zA-Z0-9]\'|"+substring[0]+substring[1]+substring[2]+")\'");
        test[4] = new testregex("String","\".*\"");
                
        
        Pattern RE;
        Matcher m;
        boolean check = false;
        
        for (int i = 0; i < 5; i++) {
            RE = Pattern.compile(test[i].RE);
            m = RE.matcher(s);
            if(m.matches())
            {
                System.out.println("It is a "+test[i].key);
                check = true;
                return true;
            }
        }
        return false;
    }

   
    
    
    
    
}
