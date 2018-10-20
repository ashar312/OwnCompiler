/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owncompiler;


import owncompiler.lexical.Lexical_analyzer;
import java.io.IOException;
import owncompiler.syntax.Syntax;

/**
 *
 * @author Bismah Rasheed
 */
public class OwnCompiler {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
     
        Lexical_analyzer lex = new Lexical_analyzer();
        Syntax syntax = new Syntax(lex.tokenlist);
        
       
       
        
        
    }
    
    
}
