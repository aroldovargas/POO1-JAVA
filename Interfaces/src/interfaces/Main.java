/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aroldo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //complete o código para chamar o método calcula para a média        
        CalculaMedia media = new CalculaMedia();
        calcula(media);                    
        //complete o código para chamar o método calcula para a mediana        
        CalculaMediana mediana = new CalculaMediana();
        calcula(mediana); 
    }
    public static double calcula(ICalcula  operacao){        
      List<Integer> lista = new ArrayList();        
      lista.add(1);
      lista.add(2); 
      lista.add(3); 
      lista.add(4); 
      lista.add(5); 
      lista.add(6);
      double resultado = operacao.calcula(lista);
      return resultado;              
    }
}
