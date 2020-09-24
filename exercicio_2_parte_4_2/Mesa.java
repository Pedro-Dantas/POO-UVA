package aula_2020_09_14_m;

/**
 *
 * @author pedro.dantas
 */
public class Mesa 
{
    String cor, modelo;
    double preco;
    int altura, largura;
    
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
}
