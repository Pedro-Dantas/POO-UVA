package exercicio_2_parte_5_2;

import java.util.Scanner;

/**
 *
 * @author pedro.dantas
 */
public class Mesa 
{
    String cor, modelo;
    double preco;
    int altura, largura, lugares;
    
    public Mesa(){}
    
    public Mesa(String c, String m, double prec, int alt, int lar, int lug)
    {
        cor = c;
        modelo = m;
        preco = prec;
        altura = alt;
        largura = lar;
        lugares = lug;
    }
    
    public Mesa(String c, String m, double prec, int alt, int lar)
    {
        cor = c;
        modelo = m;
        preco = prec;
        altura = alt;
        largura = lar;
    }
    
    public Mesa(String c, String m, double prec, int alt)
    {
        cor = c;
        modelo = m;
        preco = prec;
        altura = alt;
    }
    
    public Mesa(String c, String m, double prec)
    {
        cor = c;
        modelo = m;
        preco = prec;
    }
    
    public Mesa(String c, String m)
    {
        cor = c;
        modelo = m;
    }
    
    public Mesa(String m, double prec, int alt, int lar, int lug)
    {
        modelo = m;
        preco = prec;
        altura = alt;
        largura = lar;
        lugares = lug;
    }
    
    public Mesa(double prec, int alt, int lar, int lug)
    {
        preco = prec;
        altura = alt;
        largura = lar;
        lugares = lug;
    }
    
    public Mesa(int alt, int lar, int lug)
    {
        altura = alt;
        largura = lar;
        lugares = lug;
    }
    
    public Mesa(int lar, int lug)
    {
        largura = lar;
        lugares = lug;
    }
      
    public void setCor(String c) { cor = c; }
    
    public void setModelo(String m) { modelo = m; }
    
    public void setPreco(double prec){ preco = prec; }
    
    public void setAltura(int alt){ altura = alt; }
    
    public void setLargura(int lar){ largura = lar; }
    
    public String getCor(){ return cor; }
    
    public String getModelo(){ return modelo; }
    
    public double getPreco(){ return preco; }
    
    public int getAltura(){ return altura; }
    
    public int getLargura(){ return largura; }
    
    public void imprimir()
    {
        System.out.println("Cor: "     + getCor()      + "\n" + 
                           "Modelo: "  + getModelo()   + "\n" +
                           "Preco: "   + getPreco()    + "\n" +
                           "Altura: "  + getAltura()   + "\n" +
                           "Largura: " + getLargura()  + "\n");
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
        
        System.out.println("Entre com a altura: ");
        setAltura(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com a largura: ");
        setLargura(Integer.parseInt(input.nextLine()));
    }
}
