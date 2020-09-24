package aula_2020_09_14_m;

public class exercicio_2_parte_4 {

    public static void main(String[] args) 
    {
        Cadeira cadeira = new Cadeira();
        Carro carro = new Carro();
        Geladeira geladeira = new Geladeira();
        Mesa mesa = new Mesa();
        Televisao televisao = new Televisao();
    
        cadeira.setCor("Azul");
        cadeira.setAltura(16);
        cadeira.setLargura(8.0);
        cadeira.setLargura(3.0);
        cadeira.setQuantidade(1);
        cadeira.setPreco(35.00);
        
        System.out.println("Marca: "        + cadeira.getCor()        + "\n" + 
                           "Capacidade: "   + cadeira.getAltura()     + "\n" +
                           "Comprimento: "  + cadeira.getLargura()    + "\n" +
                           "Largura: "      + cadeira.getLargura()    + "\n" +
                           "Profundidade: " + cadeira.getQuantidade() + "\n" +
                           "Preco: "        + cadeira.getPreco()      + "\n");
        
        carro.setCor("Amarelo");
        carro.setPreco(20.000);
        carro.setModelo("Sedan");
        carro.setCapacidadeDaBagegem(30);
        carro.setNumeroDePortas(4);
        
        System.out.println("Modelo: "                + carro.getModelo()              + "\n" + 
                           "Numero de portas: "      + carro.getNumeroDePortas()      + "\n" +
                           "Cor: "                   + carro.getCor()                 + "\n" +
                           "Capacidade de bagagem: " + carro.getCapacidadeDeBagagem() + "\n" +
                           "Preco: "                 + carro.getPreco()               + "\n");
        
        geladeira.setCor("Branco");
        geladeira.setPreco(1.000);
        geladeira.setMarca("Consul");
        geladeira.setCapacidade(70);
        geladeira.setNumeroDePortas(2);
        
        System.out.println("Marca: "                 + geladeira.getMarca()            + "\n" + 
                           "Numero de portas: "      + geladeira.getNumeroDePortas()   + "\n" +
                           "Cor: "                   + geladeira.getCor()              + "\n" +
                           "Capacidade de bagagem: " + geladeira.getCapacidade()       + "\n" +
                           "Preco: "                 + geladeira.getPreco()            + "\n");
        
        mesa.setCor("Marrom");
        mesa.setPreco(750.00);
        mesa.setModelo("Quadrada");
        mesa.setAltura(70);
        mesa.setLargura(70);
        
        System.out.println("Cor: "     + mesa.getCor()      + "\n" + 
                           "Modelo: "  + mesa.getModelo()   + "\n" +
                           "Preco: "   + mesa.getPreco()    + "\n" +
                           "Altura: "  + mesa.getAltura()   + "\n" +
                           "Largura: " + mesa.getLargura()  + "\n");
        
        televisao.setMarca("Marrom");
        televisao.setPreco(750.00);
        televisao.setModelo("Quadrada");
        televisao.setPolegadas(70);
        televisao.setCor("Preta");
        
        System.out.println("Marca: "      + televisao.getMarca()     + "\n" + 
                           "Modelo: "     + televisao.getModelo()    + "\n" +
                           "Preco: "      + televisao.getPreco()     + "\n" +
                           "Polegadas: "  + televisao.getPolegadas() + "\n" +
                           "Cor: "        + televisao.getCor()       + "\n");
    }
}
