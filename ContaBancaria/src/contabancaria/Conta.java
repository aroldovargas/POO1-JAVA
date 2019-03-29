/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author Aroldo
 */


public class Conta {
    /** DECLARANDO OS ATRIBUTOS DA CLASSE CONTA*/
    private String nomeCliente;
    private double saldo=0;
    private int numero;
    private double limite=0;
    private int agencia;
    
    public Conta(){
   
   }
   public void depositar(double valor){
       this.saldo += valor;
   }
   public void sacar (double valor){
       this.saldo -= valor;
   }
   
   public void imprimirSaldo(){
       System.out.println("Prezado, "+ nomeCliente);
       System.out.println("Seu saldo atual é: R$"+ saldo);
   }
   
   public Conta(String numero, String nomeCliente, String saldo, String limite, String agencia){
       this.numero = Integer.parseInt(numero);
       this.nomeCliente = nomeCliente;
       this.saldo = Double.parseDouble(saldo);
       this.limite = Double.parseDouble(limite);
       this.agencia = Integer.parseInt(agencia);
   }
   
   public int getNumero(){
       return numero;
   }
   

   public String getNomeCliente() {
       return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
       this.nomeCliente = nomeCliente;
   }

   public double getSaldo() {
        return saldo;
   }

   public void setSaldo(double saldo) {
        this.saldo = saldo;
   }

   public double getLimite() {
       return limite;
   }

   public void setLimite(double limite) {
       this.limite = limite;
   }

   public int getAgencia() {
       return agencia;
   }

   public void setAgencia(int agencia) {
       this.agencia = agencia;
   }
   
}
