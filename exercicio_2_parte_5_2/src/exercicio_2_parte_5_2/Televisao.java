package exercicio_2_parte_5_2;

import java.util.Scanner;

/**
 *
 * @author pedro.dantas
 */
public class Televisao 
{
    
    String cor, marca, modelo, resolucao;
    double preco;
    int polegadas;
    
    public Televisao(){}
    
    public Televisao(String c, String m, double prec, String mod, int pol, String res)
    {
        cor = c;
        marca = m;
        preco = prec;
        modelo = mod;
        polegadas = pol;
        resolucao = res;
    }
    
    public Televisao(String c, String m, double prec, String mod, int pol)
    {
        cor = c;
        marca = m;
        preco = prec;
        modelo = mod;
        polegadas = pol;
    }
    
    public Televisao(String c, String m, double prec, String mod)
    {
        cor = c;
        marca = m;
        preco = prec;
        modelo = mod;
    }
    
    public Televisao(String c, String m, double prec)
    {
        cor = c;
        marca = m;
        preco = prec;
    }
    
    public Televisao(String c, String m)
    {
        cor = c;
        marca = m;
    }
    
    public Televisao(String c)
    {
        cor = c;
    }
    
    public Televisao(double prec, String m)
    {
        marca = m;
    }
    
    public Televisao(String m, double prec, String mod)
    {
        marca = m;
        preco = prec;
        modelo = mod;
    }
    
    public Televisao(double prec, int pol)
    {
        preco = prec;
        polegadas = pol;
    }
    
    public void setCor(String c) { cor = c; }
    
    public void setMarca(String m) { marca = m; }
    
    public void setPreco(double prec){ preco = prec; }
    
    public void setModelo(String mod){ modelo = mod; }
    
    public void setPolegadas(int pol){ polegadas = pol; }
    
    public String getCor(){ return cor; }
    
    public String getMarca(){ return marca; }
    
    public double getPreco(){ return preco; }
    
    public int getPolegadas(){ return polegadas; }
    
    public String getModelo(){ return modelo; }
    
    public void imprimir()
    {
        System.out.println("Marca: "      + getMarca()     + "\n" + 
                           "Modelo: "     + getModelo()    + "\n" +
                           "Preco: "      + getPreco()     + "\n" +
                           "Polegadas: "  + getPolegadas() + "\n" +
                           "Cor: "        + getCor()       + "\n");
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
        
        System.out.println("Entre com as polegadas: ");
        setPolegadas(Integer.parseInt(input.nextLine()));
    }
}
