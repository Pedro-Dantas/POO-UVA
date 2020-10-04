package exercicio_3_parte_4_3;
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
    
    public void setMarca(String marc)
    {
        if(!marc.isEmpty())
            marca = marc;
    }
    
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
        if(prec > 0)
            preco = prec;
    }
    
    public String getMarca(){ return marca; }
    
    public int getCapacidade(){ return capacidade; }
    
    public double getComprimento(){ return comprimento; }
    
    public double getLargura(){ return largura; }
    
    public double getProfundidade(){ return profundidade; }
    
    public double getPeso(){ return peso; }
    
    public double getPreco(){ return preco; }
    
    public void cadastrar(String marca, int capacidade, double comprimento, double largura,
                                            double profundidade, double peso, double preco)
    {
        setMarca(marca);
        setCapacidade(capacidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
    }
    
    
    public void entrada()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a marca: ");
        setMarca(input.nextLine());
        
        System.out.println("Entre com a capacidade: ");
        setCapacidade(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com o comprimento: ");
        setComprimento(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com a largura: ");
        setLargura(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com a profundidade: ");
        setProfundidade(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com o peso: ");
        setPeso(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com o preco: ");
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


