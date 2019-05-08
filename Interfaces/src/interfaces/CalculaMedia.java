/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

public class CalculaMedia implements ICalcula{ 
    @Override
    public double calcula(List<Integer> lista){        
        int total=0;
        for(Integer item : lista){
            total+= item;
        }        
        double media = total/lista.size();
        return media;       
    }
}