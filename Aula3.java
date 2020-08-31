package cursojavafaculdade;
import java.util.Scanner;

public class Aula3 
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        // Exercício 1
        
        System.out.println("Entre com um número: ");
        int numero = Integer.parseInt(sc.nextLine());    
        
        if(numero % 3 == 0 && numero % 4 == 0)
        {
            System.out.println("O número " + numero + " são múltiplos de 3 e 4!");
        }
        else{ System.out.println("O número " + numero + "não são multiplos de 3 e 4!" ); }
        
        // Exercício 2
        
        System.out.println("Entre com a sua idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        
        if(idade >= 0 && idade <= 10)
        {
            System.out.println("Categoria Mirin!");
        }
        else if(idade > 10 && idade <= 18)
        {
            System.out.println("Categoria Juvenil!");
        }
        else if(idade > 18 && idade <= 40)
        {
            System.out.println("Categoria Adulto!");
        }
        else{ System.out.println("Categoria Master!"); }
        
        // Exercício 3
        
        System.out.println("Entre com o número do mês: ");
        int numeroDoMes = Integer.parseInt(sc.nextLine());
        
        switch(numeroDoMes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês escolhido tem " + 31 + " dias."); break;
                
            case 2: 
                System.out.println("O mês escolhido tem " + 28 + " dias."); break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês escolhido tem " + 30 + " dias."); break;
                
            default: System.out.println("Mês não identificado!");      
        }
        
        // Exercício 4
    
        System.out.println("Entre com o primeiro valor inteiro: ");
        int primeiroValor = Integer.parseInt(sc.nextLine());
        
        System.out.println("Entre com o segundo valor inteiro: ");
        int segundoValor = Integer.parseInt(sc.nextLine());
        
        System.out.println("Os valores pares entre " + primeiroValor + " e o " + segundoValor + " é: ");
        
        if(primeiroValor < segundoValor)
        {
            for (; primeiroValor <= segundoValor; primeiroValor++) 
            {
                if(primeiroValor % 2 == 0)
                {
                    System.out.println("Valor par: " + primeiroValor);
                }
            }
        }
        
        // Exercício 5
        
        int somaDeNumerosPositivos = 0;
        
        do
        {
            System.out.println("Entre com valores positivos: ");
            int sentinela = Integer.parseInt(sc.nextLine());
            
            if(sentinela == -1)
            { 
                System.out.println("A soma dos números inteiros é: " + somaDeNumerosPositivos);
                break; 
            }
            
            somaDeNumerosPositivos += sentinela;
                
        } while(true); 
    }
}
