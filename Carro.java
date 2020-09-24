package aula_2020_09_14_m;

/**
 *
 * @author pedro.dantas
 */
public class Carro 
{
    String cor, modelo;
    double preco;
    int capacidadeDeBagagem, numeroDePortas;
    
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
    
    public int getNumeroDePortas(){ return numeroDePortas; }
    
    public int getCapacidadeDeBagagem(){ return capacidadeDeBagagem; }
}
