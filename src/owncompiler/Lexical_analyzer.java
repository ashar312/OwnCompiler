/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ashar Ashfaq
 */
public class Lexical_analyzer {
    
    
    String text = "";
    
    public Lexical_analyzer()
    {
        text = ReadFromTextFile(text);
        
        
        
        
    }
    
    
    
    
    private String ReadFromTextFile(String text)
    {
        try {
			File file = new File("C:\\Users\\Ashar Ashfaq\\Desktop\\toread.txt");
                        StringBuffer stringBuffer;
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
            }
			//System.out.println("Contents of file:");
		//	System.out.println(stringBuffer.toString());
                        text = stringBuffer.toString();
		} catch (IOException e) {
                    System.out.println(e);
		}
       
        System.out.println(text);
        return text;
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
