package exercicio_2_parte_5_2;

import java.util.Scanner;

/**
 *
 * @author pedro.dantas
 */
public class Geladeira 
{
    String cor, marca;
    double preco;
    int capacidade, numeroDePortas;
    
    public Geladeira(){}
    
    public Geladeira(String c, String m, double prec, int cap, int num)
    {
        cor = c;
        marca = m;
        preco = prec;
        capacidade = cap;
        numeroDePortas = num;
    }
    
    public Geladeira(String c, String m, double prec, int cap)
    {
        cor = c;
        marca = m;
        preco = prec;
        capacidade = cap;
    }
    
    public Geladeira(String c, String m, double prec)
    {
        cor = c;
        marca = m;
        preco = prec;
    }
    
        
    public Geladeira(String c, String m)
    {
        cor = c;
        marca = m;
    }
    
    public Geladeira(String c)
    {
        cor = c;
    }
    
    public Geladeira(String m, double prec, int cap, int num)
    {
        marca = m;
        preco = prec;
        capacidade = cap;
        numeroDePortas = num;
    }
    
    public Geladeira(double prec, int cap, int num)
    {
        preco = prec;
        capacidade = cap;
        numeroDePortas = num;
    }
    
    public Geladeira(int cap, int num)
    {
        capacidade = cap;
        numeroDePortas = num;
    }
    
    public Geladeira(int num)
    {
        numeroDePortas = num;
    }
    
    public void setCor(String c) { cor = c; }
    
    public void setMarca(String m) { marca = m; }
    
    public void setPreco(double prec){ preco = prec; }
    
    public void setCapacidade(int cap){ capacidade = cap; }
    
    public void setNumeroDePortas(int num){ numeroDePortas = num; }
    
    public String getCor(){ return cor; }
    
    public String getMarca(){ return marca; }
    
    public double getPreco(){ return preco; }
    
    public int getCapacidade(){ return capacidade; }
    
    public int getNumeroDePortas(){ return numeroDePortas; }
    
    public void imprimir()
    {
        System.out.println("Marca: "                 + getMarca()            + "\n" + 
                           "Numero de portas: "      + getNumeroDePortas()   + "\n" +
                           "Cor: "                   + getCor()              + "\n" +
                           "Capacidade: "            + getCapacidade()       + "\n" +
                           "Preco: "                 + getPreco()            + "\n");
    }
    
    public void entradaDados()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a cor: ");
        setCor(input.nextLine());
        
        System.out.println("Entre com a marca: ");
        setMarca(input.nextLine());
        
        System.out.println("Entre com a preço: ");
        setPreco(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com número de portas: ");
        setNumeroDePortas(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com a capacidade: ");
        setCapacidade(Integer.parseInt(input.nextLine()));
    }
}
