package exercicio_2_parte_5_2;

import java.util.Scanner;

/**
 *
 * @author pedro.dantas
 */
public class Cadeira 
{
    public Cadeira()
    {
    
    }
    
    public Cadeira(double a, double l, double p, int q, String m)
    {
        altura = a;
        largura = l;
        preco = p;
        quantidade = q;
        marca = m;
    }
    
    public Cadeira(double l, double p, int q, String m)
    {
        largura = l;
        preco = p;
        quantidade = q;
        marca = m;
    }
    
    public Cadeira(double p, int q, String m)
    {
        preco = p;
        quantidade = q;
        marca = m;
    }
    
    public Cadeira(int q, String m)
    {
        quantidade = q;
        marca = m;
    }
    
    public Cadeira(String c, double a, double l, double p, int q)
    {
        cor = c;
        altura = a;
        largura = l;
        preco = p;
        quantidade = q;
    }
    
    public Cadeira(String c, double a, double l, double p)
    {
        cor = c;
        altura = a;
        largura = l;
        preco = p;
    }
    
    public Cadeira(String c, double a, double l)
    {
        cor = c;
        altura = a;
        largura = l;
    }
    
    public Cadeira(String c, double a)
    {
        cor = c;
        altura = a;
    }
    
    public Cadeira(String c)
    {
        cor = c;
    }   
    
    String cor, marca;
    double altura, largura, preco;
    int quantidade;
    
    public void setCor(String c){ cor = c; }
    
    public void setMarca(String m){ marca = m; }
    
    public void setAltura(double alt)
    {
        if(alt > 0)
            altura = alt;
    }
    
    public void setLargura(double larg)
    {
        if(larg > 0)
            largura = larg;
    }
    
    public void setPreco(double prec)
    {
        if(prec > 0)
            preco = prec;
    }
    
    public void setQuantidade(int quant)
    {
        if(quant > 0)
            quantidade = quant;
    }
    
    public String getCor(){ return cor; }
    
    public double getAltura(){ return altura; }
    
    public double getLargura(){ return largura; }
    
    public double getPreco(){ return preco; }
    
    public int getQuantidade(){ return quantidade; }
    
    public String getmarca(){ return marca; }
   
    
    public void imprimir()
    {
         System.out.println("Cor: "         + getCor()        + "\n" + 
                           "Capacidade: "   + getAltura()     + "\n" +
                           "Largura: "      + getLargura()    + "\n" +
                           "Profundidade: " + getQuantidade() + "\n" +
                           "Preco: "        + getPreco()      + "\n");
    }
    
    public void entradaDados()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a cor: ");
        setCor(input.nextLine());
        
        System.out.println("Entre com a altura");
        setAltura(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com a largura: ");
        setLargura(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com a quantidade: ");
        setQuantidade(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com o preço: ");
        setPreco(Double.parseDouble(input.nextLine()));
    }
}
