package exercicio_2_parte_5_2;

public class exercicio_2_parte_5_2 {

    public static void main(String[] args) 
    {
        Cadeira cadeira = new Cadeira();
        Carro carro = new Carro();
        Geladeira geladeira = new Geladeira();
        Mesa mesa = new Mesa();
        Televisao televisao = new Televisao();
        
        cadeira.entradaDados();
        cadeira.imprimir();
        Cadeira cadeira2 = new Cadeira(2, "Mobly");
        cadeira2.imprimir();
        
        carro.entradaDados();
        carro.imprimir(); 
        Carro carro2 = new Carro("azul", "Ford", 100000.0, 35, 2, 2016);
        carro2.imprimir();
        
        televisao.entradaDados();
        televisao.imprimir(); 
        Televisao televisao2 = new Televisao(1000.0, 35);
        televisao2.imprimir();
        
        mesa.entradaDados();
        mesa.imprimir(); 
        Mesa mesa2 = new Mesa(30, 5);
        mesa2.imprimir();
    }
}
