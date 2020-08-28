package cursojavafaculdade;
import java.util.Scanner;

public class Aula2 {
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        //  Exercício 1
        
        double tempoGasto, velocidadeMedia, distancia, litrosUsados;
        
        System.out.println("Entre com o tempo gasto em viagem: ");
        tempoGasto = (Double.parseDouble(sc.nextLine()));
    
        System.out.println("Entre com a velocidade média: ");
        velocidadeMedia = (Double.parseDouble(sc.nextLine()));
        
        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia/12;
        
        System.out.println(
        "A velocidade média foi: " + velocidadeMedia + "\n"
        + "O tempo gasto foi: " + tempoGasto + "\n"
        + "A distância percorrida foi:" + distancia + "\n"
        + "Litros usados foram: " + litrosUsados + "\n"
        );
        
        //  Exercício 2
        
        double medidaRaio, altura;
        
        System.out.println("Entre com a altura da lata de óleo: ");
        altura = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("Entre com o raio da lata de óleo: ");
        medidaRaio = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("O volume da lata de óleo é: " + 
                (3.14159*(Math.pow(medidaRaio, 2))*altura));
        
        // Exercício 3
        
        int primeiroValor, segundoValor;
        
        System.out.println("Entre com o primeiro valor: ");
        primeiroValor = Integer.parseInt(sc.nextLine());
        
        System.out.println("Entre com o segundo valor: ");
        segundoValor = Integer.parseInt(sc.nextLine());
        
        System.out.println("O quadrado da diferença é: " + 
            Math.pow((primeiroValor - segundoValor), 2));
        
        System.out.println("A diferença dos quadrados é: " +
            (Math.pow(primeiroValor, 2) - Math.pow(segundoValor,2)));
               
        //  Exercício 4
        
        double produtoEmReais, taxaConversaoDolar;
        
        System.out.println("Entre com o valor do produto: ");
        produtoEmReais = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("Entre com a taxa de conversão de Real para Dolar: ");
        taxaConversaoDolar = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("O produto custa: " +
                "$" + (produtoEmReais * taxaConversaoDolar) + " doláres.");
        
        // Exercício 5
        
        int numeroVendedor, totalVendas;
        double salarioFixo, percentualDaVenda;
        
        System.out.println("Entre com o número do vendedor: ");
        numeroVendedor = Integer.parseInt(sc.nextLine());
        
        System.out.println("Entre com o salário fixo do vendedor: ");
        salarioFixo = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("Entre com o número total de vendas do vendedor: ");
        totalVendas = Integer.parseInt(sc.nextLine());
        
        System.out.println("Entre com o percentual sobre o total de vendas do vendedor: ");
        percentualDaVenda = (Double.parseDouble(sc.nextLine()));
        
        System.out.println("O salário total do vendedor: " +
                numeroVendedor + " será de: " + 
                (salarioFixo + ((percentualDaVenda * totalVendas) / 100)));
        
        // Exemplo dado em aula
        
        byte a = 75, b = 47, c = 118, d = 82, e, f, g;
        
        e = (byte) (a | b & c);
        f = (byte) (a ^ b | d & c);
        g = (byte) (a & b ^ c | d ^ e & f);
        
        System.out.println("Valores: " + e + " " + f + " " + g);
          
    }
}
