package aula_2020_09_14_m;

/**
 *
 * @author pedro.dantas
 */
public class Geladeira 
{
    String cor, marca;
    double preco;
    int capacidade, numeroDePortas;
    
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
}
