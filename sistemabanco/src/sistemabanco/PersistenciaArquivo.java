package sistemabanco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip_kja6gpn
 */
public class PersistenciaArquivo {

    public void salvarContaCC(ContaCorrente conta) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Bruno\\contas.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNomeCliente() + "," +conta.getNumConta()
                + ","+ conta.getNumAgencia()+","+ conta.getLimite() +"," + conta.getSaldo()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void salvarContaCP(ContaPoupanca conta) {
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Bruno\\contas.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNomeCliente() + "," +conta.getNumConta()
                + ","+ conta.getNumAgencia()+"," + conta.getSaldo()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

}