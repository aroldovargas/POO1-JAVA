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
public class CriaPergunta {
    
    public void perguntaSoma(){
        int operador1 = ThreadLocalRandom.current().nextInt(0,100);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resposta = JOptionPane.showInputDialog("Quanto é "+ operador1 + "+" + operador2, JOptionPane.QUESTION_MESSAGE);
        int respostaEmInt = Integer.parseInt(resposta);
            
        if (operador1 + operador2 == respostaEmInt)
            JOptionPane.showMessageDialog(null, "Você acertou!");
        else
            JOptionPane.showMessageDialog(null,"Você errou!");
        }
    
    public void perguntaSub(){
        int operador1 = ThreadLocalRandom.current().nextInt(0,100);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resposta = JOptionPane.showInputDialog("Quanto é "+ operador1 + "-" + operador2, JOptionPane.QUESTION_MESSAGE);
        int respostaEmInt = Integer.parseInt(resposta);
            
        if (operador1 - operador2 == respostaEmInt)
            JOptionPane.showMessageDialog(null, "Você acertou!");
        else
            JOptionPane.showMessageDialog(null,"Você errou!");
        }
    
    public void perguntaProd(){
        int operador1 = ThreadLocalRandom.current().nextInt(0,10);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resposta = JOptionPane.showInputDialog("Quanto é "+ operador1 + "*" + operador2, JOptionPane.QUESTION_MESSAGE);
        int respostaEmInt = Integer.parseInt(resposta);
            
        if (operador1 * operador2 == respostaEmInt)
            JOptionPane.showMessageDialog(null, "Você acertou!");
        else
            JOptionPane.showMessageDialog(null,"Você errou!");
        }
    
    
}
