package aula_2020_09_14_m;

/**
 *
 * @author pedro.dantas
 */
public class Televisao 
{
    
    String cor, marca, modelo;
    double preco;
    int polegadas;
    
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
}
