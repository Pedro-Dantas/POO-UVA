package exercicio_2_parte_5_2;

import java.util.Scanner;

/**
 *
 * @author pedro.dantas
 */
public class Carro 
{
    String cor, modelo;
    double preco;
    int capacidadeDeBagagem, numeroDePortas, ano;
    
    public Carro(){}
    
     public Carro(String c, String m, double p, int cap, int nump, int a)
     {
         cor = c;
         modelo = m;
         preco = p;
         capacidadeDeBagagem = cap;
         numeroDePortas = nump;
         ano = a;
     }
     
     public Carro(String c, String m, double p, int cap, int nump)
     {
         cor = c;
         modelo = m;
         preco = p;
         capacidadeDeBagagem = cap;
         numeroDePortas = nump;
     }
     
     public Carro(String c, String m, double p, int cap)
     {
         cor = c;
         modelo = m;
         preco = p;
         capacidadeDeBagagem = cap;
     }
     
     public Carro(String c, String m, double p)
     {
         cor = c;
         modelo = m;
         preco = p;
     }
     
          
     public Carro(String c, String m)
     {
         cor = c;
         modelo = m;
     }
     
    public Carro(String c)
     {
         cor = c;
     }
     
     public Carro(String m, double p, int cap)
     {
         modelo = m;
         preco = p;
         capacidadeDeBagagem = cap;
     }
     
     public Carro(double p, int cap)
     {
         preco = p;
         capacidadeDeBagagem = cap;
     }
     
     public Carro(int cap)
     {
         capacidadeDeBagagem = cap;
     }
     
     
    public void setCor(String c){ cor = c; }
    
    public void setModelo(String model){ modelo = model; }
    
    public void setPreco(double prec) {
        if(prec > 0)
            preco = prec;
    }
    
    public void setNumeroDePortas(int num)
    {
        if(num > 0)
            numeroDePortas = num;
    }
    
    public void setCapacidadeDaBagegem(int cap)
    {
        if(cap > 0)
            capacidadeDeBagagem = cap;
    }
    
    public String getCor(){ return cor; }
    
    public String getModelo(){  return modelo; }
    
    public double getPreco(){ return preco; }
    
    public double getAno(){ return ano; }
    
    public int getNumeroDePortas(){ return numeroDePortas; }
    
    public int getCapacidadeDeBagagem(){ return capacidadeDeBagagem; }
    
    public void imprimir()
    {
        System.out.println("Modelo: "                + getModelo()              + "\n" + 
                           "Numero de portas: "      + getNumeroDePortas()      + "\n" +
                           "Cor: "                   + getCor()                 + "\n" +
                           "Capacidade de bagagem: " + getCapacidadeDeBagagem() + "\n" +
                           "Ano: "                   + getAno()                 + "\n" +     
                           "Preco: "                 + getPreco()               + "\n");
    }
    
    public void entradaDados()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a cor: ");
        setCor(input.nextLine());
        
        System.out.println("Entre com a modelo: ");
        setModelo(input.nextLine());
        
        System.out.println("Entre com a preço: ");
        setPreco(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com o número de portas: ");
        setNumeroDePortas(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com a capácidade da bagagem: ");
        setCapacidadeDaBagegem(Integer.parseInt(input.nextLine()));
    }
}
