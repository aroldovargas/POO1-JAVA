/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoPerguntas;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Aroldo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res = ThreadLocalRandom.current().nextInt(1,4);
        CriaPergunta pergunta = new CriaPergunta();
        
        if (res == 1)
            pergunta.perguntaSoma();
        
        if (res == 2)
            pergunta.perguntaSub();
        
        if (res == 3)
            pergunta.perguntaProd();
        
        
        // TODO code application logic here
    }
}
