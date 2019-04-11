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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res = ThreadLocalRandom.current().nextInt(1,4);
   
      
        if (res == 1){
            Soma perguntaSoma =  new Soma();
            perguntaSoma.criarPergunta();
        }
                
        if (res == 2){
            Subtracao perguntaSubtracao = new Subtracao();
            perguntaSubtracao.criarPergunta();
        }
        
        if (res == 3){
            Produto perguntaProduto = new Produto();
            perguntaProduto.criarPergunta();
        }
    }
}