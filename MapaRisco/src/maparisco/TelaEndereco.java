/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maparisco;
import javax.swing.JOptionPane;

/**
 *
 * @author Aroldo
 */
public class TelaEndereco {
    
    public Endereco getEndereco(){
        Endereco endereco = new Endereco();
        endereco.setNomeRua(JOptionPane.showInputDialog("Rua:"));
        endereco.setNomeBairro(JOptionPane.showInputDialog("Bairro:"));
        endereco.setNomeCidade(JOptionPane.showInputDialog("Cidade:"));
        JOptionPane.showMessageDialog(null,endereco.toString());
        
        return endereco;
    }

}
