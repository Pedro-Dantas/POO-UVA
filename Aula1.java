package cursojavafaculdade;
import java.util.Scanner;

public class Aula1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Examplo dado em aula 1
        
        String matricula, nome;
        double primeiraNota, segundaNota;
        int idade;
        
        System.out.println("Entre com a matrícula: ");
        matricula = (sc.nextLine());
        
        System.out.println("Entre com o nome: ");
        nome = (sc.nextLine());
        
        System.out.println("Entre com a sua idade: ");
        idade = Integer.parseInt((sc.nextLine()));
        
        System.out.println("Entre com a nota A1: ");
        primeiraNota = Double.parseDouble((sc.nextLine()));
       
        System.out.println("Entre com a nota A2: ");
        segundaNota = Double.parseDouble((sc.nextLine()));
        
        System.out.println("A matrícula é: " + matricula + "\n"
                + "Nome: "   + nome + "\n"
                + "Idade: "  + idade + "\n"
                + "Nota 1: " + primeiraNota + "\n"
                + "Nota 2: " + segundaNota + "\n"
                + "Média: "  + (primeiraNota+segundaNota)/2);
        
        
        
        //Exercício de fixação. Área e volume de um quadrilátero.
        
        int profundidade, altura, largura, area, volume;
        
        System.out.println("\nCalculo de área para um quadrilátero: ");
        
        System.out.println("Entre com a profundidade: ");
        profundidade = (Integer.parseInt(sc.nextLine()));
        
        System.out.println("Entre com a lagura: ");
        largura = (Integer.parseInt(sc.nextLine()));
        
        System.out.println("Entre com a altura: ");
        altura = (Integer.parseInt(sc.nextLine()));
        
        area = largura * altura;
        volume = largura * altura * profundidade;
        
        System.out.println("A área do quadrado é " + area + " e o volume é " + volume);
    }
    
}
