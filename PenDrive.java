package Aula_2020_09_14_m_exercicio_1;
import java.util.Scanner;
/**
 *
 * @author pedro.dantas
 */
public class PenDrive 
{
    String marca;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;
    
    public void setMarca(String marc){ marca = marc; }
    
    public void setCapacidade(int cap)
    {
        if(cap > 0)
            capacidade = cap;
    }
    
    public void setComprimento(double comp)
    {
        if(comp > 0)
            comprimento = comp;
    }
    
    public void setLargura(double larg) 
    {
        if (larg > 0) 
            largura = larg;
    }
    
    public void setProfundidade(double prof)
    {
        if(prof > 0)
            peso = prof;
    }
    
    public void setPeso(double pes)
    {
        if(pes > 0)
            preco = pes;
    }
    
    public void setPreco(double prec)
    {
        preco = prec;
    }
    
    public String getMarca(){ return marca; }
    
    public int getCapacidade(){ return capacidade; }
    
    public double getComprimento(){ return comprimento; }
    
    public double getLargura(){ return largura; }
    
    public double getProfundidade(){ return profundidade; }
    
    public double getPeso(){ return peso; }
    
    public double getPreco(){ return preco; }
    
    public void entrada()
    {
        Scanner input = new Scanner(System.in);
        setMarca(input.nextLine());
        setCapacidade(Integer.parseInt(input.nextLine()));
        setComprimento(Double.parseDouble(input.nextLine()));
        setLargura(Double.parseDouble(input.nextLine()));
        setComprimento(Double.parseDouble(input.nextLine()));
        setPeso(Double.parseDouble(input.nextLine()));
        setPreco(Double.parseDouble(input.nextLine()));
    }
    
    public void imprimir()
    {
        System.out.println("Marca: "        + getMarca()        + "\n" + 
                           "Capacidade: "   + getCapacidade()   + "\n" +
                           "Comprimento: "  + getComprimento()  + "\n" +
                           "Largura: "      + getLargura()      + "\n" +
                           "Profundidade: " + getProfundidade() + "\n" +
                           "Peso: "         + getPeso()         + "\n" +
                           "Preco: "        + getPreco());
    }
}


