package aula_2020_09_14_m;

/**
 *
 * @author pedro.dantas
 */
public class Cadeira 
{
    String cor;
    double altura, largura, preco;
    int quantidade;
    
    public void setCor(String c){ cor = c; }
    
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
}
